package VariableDemo;
class Student
{
	//instance var
	int English;
	int Maths;
	//////int avg;
	public void display()
	{
		//Local var
		int avg=60;
		System.out.println(avg);
	}
}

public class LocalVar {

	public static void main(String[] args) {
		// mark of the student1
		Student anu=new Student();
		anu.English=70;
		anu.Maths=80;
		//local variable cant access outside the block
		//anu.avg=9;
		anu.display();
		

	}

}
