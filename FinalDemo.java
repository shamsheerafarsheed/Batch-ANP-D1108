package ExceptionExamples;

/*final variable--->Stop change value
 * 
 * Final method-->stop overriding
 * 
 * Final Class--->Stop inheritance
 * 
 */
 final class A
{
	final int  x=90;
	final void run()
	{
		
	}
}
public class FinalDemo   {

	public static void main(String[] args) {
		A obj=new A();
		//obj.x=45;--->we cant change value of final var
		/*final void run()
		{
			/we cant override final method
		}*/
		
	}

}
