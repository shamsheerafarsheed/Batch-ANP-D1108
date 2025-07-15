package operatorsDemo;

public class LogicalOperatorDemo {

	public static void main(String[] args) {
		// &&,||
		int m=12;
		int n=54;
		//&&-->if every cond is true then only it will return true
		if(m==n&&n>m)
		{
			System.out.println("Result is True");
		}
		else
		{
			System.out.println("Result is False");
		}
		//||-->if any cond is true then  it will return true
				if(m==n||n>m)
				{
					System.out.println("Result is True");
				}
				else
				{
					System.out.println("Result is False");
				}
		
	}

}
