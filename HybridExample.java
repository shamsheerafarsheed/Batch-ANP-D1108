package inheritanceDemo;
//Base class
class Person
{
	String name;
	int id;
	void  displayInfo()
	{
		System.out.println("Name:"+name);
		System.out.println("ID:"+id);
	}
}
//Student derived from Person
class student extends Person
{
	String course;
	void  displaStudent()
	{
		System.out.println("Courses:"+course);
		
	}
	
}
//interface-Scholarship criteria
interface Scholarship
{
void showScholarshipDetails();	
}
class ScholarshipStudent extends student implements Scholarship
{
	double scholarshipAmount;
	public void showScholarshipDetails()
	{
		System.out.println("Scholarship Amount:"+scholarshipAmount);
	}
}
public class HybridExample {

	public static void main(String[] args) {
		ScholarshipStudent s=new ScholarshipStudent();
		s.name="Shipitha";
		s.id=101;
		s.course="Btech";
		s.scholarshipAmount=10000;
		System.out.println("-----------Student Details---------------");
		s.displayInfo();
		s.displaStudent();
		s.showScholarshipDetails();
		

	}

}
