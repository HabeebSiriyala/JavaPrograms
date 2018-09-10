package programs;

public class LargestNumber {

	public static void main(String[] args) {

		int arr[] = {2,5,7,9,3,1};
		int val = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>val) {
				val=arr[i];
			}
		}
		System.out.println("The Largest value is :"+val);
	}
}
