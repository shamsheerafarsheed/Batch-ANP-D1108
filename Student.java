package AccessModifierDemo;

public class Student {

	public static void main(String[] args) {
		 AccessModifierEx s1=new AccessModifierEx();
			
			System.out.println(s1.name);
			System.out.println(s1.age);
			//private var cant access outside the class
			//System.out.println(s1.email);
			System.out.println(s1.city);
	}

}
