package constructorDemo;

public class NoArgumentConstructorDemo {
	String name;
	//no argument Constructor
	NoArgumentConstructorDemo()
	{
		name="Anudip Foundation";
	}

	public static void main(String[] args) {
		NoArgumentConstructorDemo obj=new NoArgumentConstructorDemo();
		System.out.println("Company name is:"+obj.name);

	}

}
