package ExceptionExamples;

public class ThrowDemo {
	static void checkage(int age)
	{
		if(age<18)
		{
	throw new ArithmeticException("OOPS!!!You are not eligible for vote");
}
		else
		{
System.out.println("Yes..You are eligible");
		}
		}
	public static void main(String[] args) {
		// calling method
		checkage(21);

	}

}
