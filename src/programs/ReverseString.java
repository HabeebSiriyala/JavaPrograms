package programs;

public class ReverseString {

	public static void main(String[] args) {

		// IQ:Reverse a String?
		// IQ:Difference b/w String and StringBuffer?
		// IQ:Do we have reverse() in String?

		// String is immutable-- thats y there is no reverse() function in string
		System.out.println("****Using For Loop****");

		String s = "Selenium";
		// i.Using For Loop
		int len = s.length();// 8
		String rev = "";
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);// muineleS
		}
		System.out.println(rev);

		// 2.Using StringBuffer Class
		System.out.println("****Using StringBuffer****");
		// StringBuffer is Mutable---- thats y there is a reverse() function
		StringBuffer sf = new StringBuffer(s);
		System.out.println(sf.reverse());

	}
}
