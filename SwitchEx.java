package ControlStatmnt;

import java.util.Scanner;

class Calculator
{
	int num1,num2;
	Calculator(int a,int b)
	{
		num1=a;
		num2=b;
	}
	
}
public class SwitchEx {

	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
System.out.println("Enetr the first number");
a=sc.nextInt();
System.out.println("Enetr the second number");
b=sc.nextInt();
Calculator obj=new Calculator(a,b);
System.out.println("Enter your choice[+,-,*,/,%]");
String ch;
ch=sc.next();
char array[]=ch.toCharArray();
switch(array[0])
{
case '+':System.out.println("Addition is:"+(obj.num1+obj.num2));
break;
case '-':System.out.println("substraction is:"+(obj.num1-obj.num2));
break;
case '*':System.out.println("Multiplication is:"+(obj.num1*obj.num2));
break;
case '/':System.out.println("Divition is:"+(obj.num1/obj.num2));
break;
case '%':System.out.println("Modulus is:"+(obj.num1%obj.num2));

break;
default:System.out.println("OOPS!!!!please enter correction option");
break;
}


	}

}
