package AccessModifierDemo;
//Default Class

//public class --accessible from anywhere
public class AccessModifierEx {
	
	public String name="Dyan";
	//Default Var
	int age=20;
	//private var
	private String email="Dyan@gmail.com";
	//Protected var
	protected String city="Banglore";
	//method
	public static void display()
	{
	//System.out.println(email);
	}

	public static void main(String[] args) {
		 int phn=765483;
		//created object
		 AccessModifierEx s1=new AccessModifierEx();
		
		System.out.println(s1.name);
		System.out.println(s1.age);
		//private var cant access outside the class
		//System.out.println(s1.email);
		System.out.println(s1.city);
	}

}
