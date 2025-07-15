package operatorsDemo;

import java.util.Scanner;

//3 operands
public class TernaryDemo {

	public static void main(String[] args) {
		// taking user input
		Scanner sc=new Scanner(System.in);
		System.out.println("enter mark:");
		double mark=sc.nextDouble();
		//ternary operation
		String result=(mark>=50)?"pass":"Fail";
		System.out.println("You "+result+" in the exam");
		
	}

}
