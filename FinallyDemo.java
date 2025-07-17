package ExceptionExamples;

public class FinallyDemo {

	public static void main(String[] args) {
		try
		{
		String arr[]= {"Arfa","Dhyan","Charan","Spoorthi","Chandana"};
		System.out.println(arr[10]);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e1)
		{
			System.out.println(e1);
		}
		catch(Exception f)
		{
			System.out.println("OOPS data not found!!!");
		}
	
finally
{
	System.out.println("the finally statement let you to execute code if exception handled or not ");
}
}}
