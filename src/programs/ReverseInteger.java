package programs;

public class ReverseInteger {

	public static void main(String[] args) {

		// 1.Using Algorithm
		System.out.println("*****Using While Loop*****");
		long num = 123456789;
		long rev = 0;

		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10; //
		}
		System.out.println(rev);

		// 2.Using StringBuffer
		System.out.println("*****Using String Buffer*****");
		long num1 = 949412;
		StringBuffer sb = new StringBuffer(String.valueOf(num1));
		System.out.println(sb.reverse());
		// System.out.println(new StringBuffer(String.valueOf(num1)).reverse());

	}
}
