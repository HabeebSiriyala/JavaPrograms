package programs;

public class StringManipulation {

	public static void main(String[] args) {

		String str = "The rains have started here selenium";
		String str1 = "The rains have started here Selenium";

		// length()---Returns the length of this string
		System.out.println(str.length());

		// charAt()---Returns the char value at the specified index
		System.out.println(str.charAt(7));

		// indexOf()---Returns the index within this string of the first occurrence of
		// the specified character.
		System.out.println(str.indexOf('s'));
		System.out.println(str.indexOf('s', 1 + str.indexOf('s')));
		System.out.println(str.indexOf('s', 1 + str.indexOf('s', 1 + str.indexOf('s'))));

		System.out.println(str.indexOf("have"));
		System.out.println(str.indexOf("hello"));

		// String Comparision:
		System.out.println(str.equals(str1));
		System.out.println(str.equalsIgnoreCase(str1));

		// SubString Method
		System.out.println(str.substring(0, 9));

		// Trim the String
		String s1 = "   Habeeb Siriyala";
		System.out.println(s1.trim());
		// Replace method
		System.out.println(s1.replace(" ", ""));
		String s3 = "10-06-1999"; // 10/06/1999
		System.out.println(s3.replace("-", "/"));

		// Split---
		String test = "Hello_World_Test_Selenium";
		String testval[] = test.split("_");
		for (int i = 0; i < testval.length; i++) {
			System.out.println(testval[i]);
		}

		// String Concat
		String ss = "habee";
		System.out.println(ss.concat("b"));

		String x = "Hello";
		String y = "World";
		int a = 100;
		int b = 200;
		System.out.println(x + y);
		System.out.println(a + b);
		System.out.println(x + y + a + b);
		System.out.println(a + b + x + y);
		System.out.println(a + x + y + b);

	}
}
