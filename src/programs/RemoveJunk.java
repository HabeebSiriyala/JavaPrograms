package programs;

public class RemoveJunk {

	public static void main(String[] args) {
		// IQ: How will you Junk or unwanted characters

		String s = "Habeeb89569965566665596655966";
		String n = "6S154i554r55i55y54a5l7a56 65H5a7b9e3e1213b";
		// Regular Expression:[^a-zA-Z0-9]
		s = s.replaceAll("[^a-zA-Z]", "");
		System.out.println(s);

		n = n.replaceAll("[^a-zA-Z ]", "");
		System.out.println(n);

	}
}
