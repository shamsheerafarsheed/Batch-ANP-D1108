package inheritanceDemo;
interface HumanWalk
{
	//every method defined under interface is by default abstract method
	void walk();
	
}
interface HumanEat
{
	
	void eat();
	
}

public class HumanDemo implements HumanWalk,HumanEat{
	public void walk()
	{
		System.out.println("Human can walk");
	}
	
	public void eat()
	{
		System.out.println("Human can eat");
	}
	public static void main(String[] args) {
		HumanDemo obj=new HumanDemo();
		obj.walk();
		obj.eat();

	}

}
