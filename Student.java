package ToStringDemo;

public class Student {
	int id;
	String name;
	
	Student(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	//override toString()--->return object as String
	public String toString()
	{
		return "Student[ID=" +id+",Name=" +name+ "]";
	}
	public static void main(String[] args) {
		Student s=new Student(1,"Kiran");
		System.out.println(s);	
		}

}
