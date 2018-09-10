package programs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {

		String names[] = { "java", "javaScript", "Ruby", "Python", "C#", "java", "Hadoop", "C", "Perl", "Hadoop",
				"SQL" };

		// 1.Compare each Element:
		// i used two for loops so the time complexity is O(n*n)/O(n^2)-----worst
		// solution
		for (int i = 0; i < names.length; i++) {
			for (int j = i + 1; j < names.length; j++) {
				if (names[i].equals(names[j])) {
					System.out.println("Duplicate Element is :" + names[i]);
				}
			}
		}
		System.out.println("**************************");
		// 2.Using HashSet:Its a part of java Collection
		// HashSet: It stores Unique Values.
		// here the complexity is less like O(n)
		Set<String> store = new HashSet<String>();
		for (String name : names) {
			if (store.add(name) == false) {
				System.out.println("Duplicate Element is :" + name);
			}
		}

		System.out.println("**************************");
		// Using HashMap
		// here the complexity is less like O(2n)
		Map<String, Integer> storeMap = new HashMap<String, Integer>();

		for (String name : names) {
			Integer count = storeMap.get(name);
			if (count == null) {
				storeMap.put(name, 1);
			} else {
				storeMap.put(name, ++count);
			}
		}
		// get the values from this HashMap:
		Set<Entry<String, Integer>> entrySet = storeMap.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.println("Duplicate Element is :" + entry.getKey());
			}
		}
	}
}
