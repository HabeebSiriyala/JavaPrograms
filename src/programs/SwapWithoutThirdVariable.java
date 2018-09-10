package programs;

public class SwapWithoutThirdVariable {

	public static void main(String[] args) {

		int x = 5; //0101
		int y = 10; //1010
		
		//1.With Using Third Variable:t
		/*
		int t;
		t=x;//5
		x=y;//10
		y=t;//5
		System.out.println(x);
		System.out.println(y);
		 */
		
		//2.Without Using Third Variable:
		//Using + Operator
		/*
		x = x+y; //15
		y = x-y; //5
		x = x-y; //10
		System.out.println(x);
		System.out.println(y);
		*/
		
		//3.Without Using Third Variable:
		//Using * Operator
		/*
		x = x*y; //50
		y = x/y; //10
		x = x/y; //5
		System.out.println(x);
		System.out.println(y);
		*/
		
		//4.Using XOR Operator
		/*
		 A	    B	    C
        0  XOR 	0	->	0
        0  XOR 	1	->	1
        1  XOR 	0	->	1
        1  XOR 	1	->	0
		 */

		x = x ^ y; //15--->1111
		y = x ^ y;
		x = x ^ y;
		System.out.println(x);
		System.out.println(y);
		
		
		
	}

}
