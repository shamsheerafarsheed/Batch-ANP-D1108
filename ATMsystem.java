package LoopDemo;

import java.util.Scanner;

public class ATMsystem {

	public static void main(String[] args) {
		final int pin=1234;
		int enteredPin;
		int attempts=0;
		final int maxAttempts=3;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("Enter your 4 digit pin");
			
			enteredPin=sc.nextInt();
			attempts++;
			if(enteredPin==pin)
			{
				System.out.println("Access Granted");
				break;
			}else
			{
				System.out.println("Incorrect Pin try again");
			}
			}while(attempts<maxAttempts);
			if(enteredPin!=pin)
			{
				System.out.println("Too many wrong attempts.card blocked");
			
		}
	}

}
