package ExceptionExamples;

public class TryCatchDemo {

	public static void main(String[] args) {
		int a=10;
		for(int i=3;i>=0;i--)
			//below code may raise an exception
			try
		{
			System.out.println(a/i);
		}
catch(Exception e)
		{
	System.out.println(e);
	//System.out.println("We cant divide number by Zero");
		}
	}

}
