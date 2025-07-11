package ControlStatmnt;

public class PrimeDemo {

	public static void main(String[] args) {
	int a=13;//a is the number that we need to check prime or not
	int i;
	int flag=0;
	if(a==0||a==1)
	{
		System.out.println(a+"is neither prime nor composit");
	}
	else
	{
		for(i=2;i<a;i++)
		{
			if(a%i==0)
			{
				System.out.println(a+"is not a prime number");
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println(a+"is prime");
		}
	}

	}

}
