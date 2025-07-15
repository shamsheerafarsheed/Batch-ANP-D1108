package operatorsDemo;
/*
 * AND
 * x=0,y=0--> x&y=0
 * x=0,y=1--> x&y=0
 * x=1,y=0--> x&y=0
 * x=1,y=1--> x&y=1
 * OR
 * 
 * x=0,y=0--> x|y=0
 * x=0,y=1--> x|y=1
 * x=1,y=0--> x|y=1
 * x=1,y=1--> x|y=1
 * XOR
 * x=0,y=0--> x^y=0
 * x=0,y=1--> x^y=1
 * x=1,y=0--> x^y=1
 * x=1,y=1--> x^y=0
 */

public class BitwiseOprtr {

	public static void main(String[] args) {
		int x=12;//01100
		int y=25;//11001
		
		System.out.println("x^y:"+(x^y));//10101
		System.out.println("x&y:"+(x&y));//01000
		System.out.println("x|y:"+(x|y));//11101
		

	}

}
