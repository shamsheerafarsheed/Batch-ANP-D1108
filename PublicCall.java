package DataTypesDemo;

import AccessModifierDemo.AccessModifierEx;
//import AccessModifierDemo.Student;

public class PublicCall  {

	public static void main(String[] args) {
		 AccessModifierEx s1=new AccessModifierEx();
		
		System.out.println(s1.name);
		//age is default so we cant access outside the package
		//System.out.println(s1.age);
		//private var cant access outside the class
		//System.out.println(s1.email);
		//city is protected so no accessible outside the package
		//System.out.println(s1.city);
	}

}
