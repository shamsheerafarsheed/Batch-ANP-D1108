package ExceptionExamples;

import java.util.Scanner;

public class ThrowsDemo {
	static void fun(int a,int b)throws ArithmeticException,ArrayIndexOutOfBoundsException
	
	{
		System.out.println(10/a);
		int arr[]= {12,23,45};
		System.out.println(arr[b]);
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try
		{
			fun(sc.nextInt(),sc.nextInt());
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e1)
		{
			System.out.println("Something went wrong");
		}

	}

}
