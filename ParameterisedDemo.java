package constructorDemo;

public class ParameterisedDemo {
	String Language;
	//Constructor will accept the value
//instance var
		//Parameterised Constructor
		ParameterisedDemo(String Language)//local var
		{
			
		this.Language=Language;
		System.out.println(Language+" is a"+"Programming Language");
		}
	public static void main(String[] args) {
		
		ParameterisedDemo L1=new ParameterisedDemo("Java");
		ParameterisedDemo L2=new ParameterisedDemo("Python");
		ParameterisedDemo L3=new ParameterisedDemo("C++");
		
	}

}
