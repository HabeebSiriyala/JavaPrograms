package programs;

public class StringSwap {

	public static void main(String[] args) {
		//WAP to swap Strings without Using temp/third Variables:
		
		String a = "Hello";
		String b = "World";
		
		System.out.println("Before Swapping");
		System.out.println("The Value of a is :" +a);
		System.out.println("The value of b is :" +b);
		
		//1.Append a and b
		a = a+b;//HelloWorld
		
		//2.Store initial String a in String b
		b = a.substring(0, a.length()-b.length());
		
		//3.Store initial String b in String a
		a = a.substring(b.length());
		
		System.out.println("the value of a and b after swapping");
		
		System.out.println("the value of a is :"+a);
		System.out.println("the value of b is :"+b);
		
	}
}
