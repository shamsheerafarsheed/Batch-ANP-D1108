package StringDemo;

public class StringEx {

	public static void main(String[] args) {
		// Declare the string in 2 ways(1.Literal way,2.using new keyword)
		//Literal way
		String str="Welcome";
		System.out.println(str);
		String str1=" to";
		String str2="      Java";
		System.out.println(str2);
		String str3="Welcome";
		//trim()-->remove unwanted spaceSystem.out.println(str2);
		System.out.println(str2.trim());
		//Declare String using new keyword
		String str4=new String("Welcome");
		//equal(it wil check values only)/==(value and location)
		System.out.println(str.equals(str4));
		System.out.println(str==str4);//check location too
		System.out.println(str.equals(str3));
		System.out.println(str==str3);//check location too
		
		
		
	}

}
