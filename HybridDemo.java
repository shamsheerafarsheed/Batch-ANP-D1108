package inheritanceDemo;
class Humanbody
{
	//normal method --having body
public void displayHuman()
{
System.out.println("Method defined inside the Human Body(parent) Class");
}
}
interface Male1
{
	public void show();
	
}
interface Female1
{
	public void show();
}
//HybridDemo(child class) inherited from Human body (parent class )
public class HybridDemo extends Humanbody implements Male1,Female1 {
	void displayHybridDemo()
	{
		System.out.println("Method defined inside the Child Class");
	}
	@Override
	public void show() {
		
		System.out.println("implementation of show() method defined in the male and female interface");
	}
	

	public static void main(String[] args) {
		HybridDemo obj=new HybridDemo();
		obj.displayHuman();
		obj.show();
		obj.displayHybridDemo();
	}

	

}
