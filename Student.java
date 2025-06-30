package constructorDemo;

public class Student {
	int id;
	String name;
	int age;
	//Creating parameterised Constructor
	
	Student(int id,String name,int age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
	}
	void display()
	{
		System.out.println("ID:"+id+" "+" Name:"+name+" "+"Age:"+" "+age);
	}
	
	public static void main(String[] args) {
		// creating an object and passing values
		
		Student s1=new Student(101,"Anusha",20);
		Student s2=new Student(102,"Urmila",20);
		Student s3=new Student(103,"Muskan",20);
		Student s4=new Student(104,"Dhyan",20);
		s1.display();
		s2.display();
		s3.display();
		s4.display();
		
	}

}
