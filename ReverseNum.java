package LoopDemo;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		// 1345--->5431
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		while(num!=0)
		{
			int rem=num%10;//567%10=7,56%10=6,5%10=5
			System.out.print(rem);//7 6 5
			num=num/10;//567/10=56,56/10=5,5/10
		}
	}

}
