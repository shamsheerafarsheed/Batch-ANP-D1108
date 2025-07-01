package inheritanceDemo;
class Human
{
	String name;
	void display()
	{
		System.out.println("I am a human being:");
	}
	void eat()
	{
		
	}
}
class Male extends Human
{
	void eat()
	{
		System.out.println("Male can eat Food");
	}
	void getInfo()
	{
		name="Charan";
		System.out.println("I am :"+name);
	}
}
class Female extends Human
{
	void eat()
	{
		System.out.println("FeMale can eat Food");
	}
	void getInfo()
	{
		name="Urmila";
		System.out.println("I am :"+name);
	}
}
public class HeirarchielDemo {

	public static void main(String[] args) {
		Female f=new Female();
		f.eat();
		f.getInfo();
		Male m=new Male();
		m.eat();
		m.getInfo();
				

	}

}
