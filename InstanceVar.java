package VariableDemo;

class Employee
{
	//instance var
	String name="Pooja";
	Double salary=20000d;
	public void show()
	{
		
		
		System.out.println("This is an example of instance variable:");
	}
	
	
	Employee()
	{
		
	}
	
}
public class InstanceVar {

	public static void main(String[] args) {
		Employee obj=new Employee();
		System.out.println(obj.name);
		System.out.println(obj.salary);
		obj.show();

	}

}
