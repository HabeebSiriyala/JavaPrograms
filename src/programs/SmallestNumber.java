package programs;

public class SmallestNumber {

	public static void main(String[] args) {

		int arr[] = { 45, 868, 5468, 35554, 531, 2131 };
		int val = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < val) {
				val = arr[i];
			}
		}
		System.out.println("The Smallest Number is :" + val);
	}
}
