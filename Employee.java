package ClassDemo;

import java.util.Scanner;

public class Employee {
	//Default Constructor--by default constructor will create after created the class
	 Employee()
	 {
		 
	 }
	 //feilds/states/member var of the class-all the var depend on the class Employee itself
	 int id;
	 int age;
	 String ename;
	 double salary;
	 //behaviour of the class(method)
	 void entervalue()
	 {
		 //for taking user input
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter your ID:");
		 id=sc.nextInt();
		 System.out.println("Enter your Age:");
		 age=sc.nextInt();
		 System.out.println("Enter your Name:");
		 ename=sc.next();
		 System.out.println("Enter your Salary:");
		 salary=sc.nextDouble();
	 }
void show()
{
	System.out.println("ID:"+id);
	System.out.println("Name:"+ename);
	System.out.println("Age:"+age);
	System.out.println("Salary:"+salary);
	
}
	public static void main(String[] args) {
		 Employee obj=new  Employee();
		 obj.entervalue();
		 obj.show();
		 
	}

}
