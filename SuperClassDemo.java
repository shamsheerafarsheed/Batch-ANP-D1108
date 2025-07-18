package SuperDemo;
class Father
{
	String name="Rajan";
}
class Son extends Father
{
	String name="Arun";
	void display()
	{
		System.out.println(name);
		System.out.println(super.name);
	}
}
public class SuperClassDemo {

	public static void main(String[] args) {
		 Son s=new Son();
		 s.display();

	}

}
