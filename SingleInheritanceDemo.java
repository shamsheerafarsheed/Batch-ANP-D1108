package inheritanceDemo;
//parent class
class Electronics
{
	Electronics()
	{
		System.out.println("This is a Parent Class:Electronics");
	}
	public void deviceType()
	{
		System.out.println("DeviceType:Electronics");
	}

	public void price()
	{
		System.out.println("Device price:");
	}
	
}
class Mixer extends Electronics
{
	Mixer()
	{
		System.out.println("Subclass:Mixer ");
	}
	public void price()
	{
		System.out.println("Device price:5000");
	}
	public void category()
	{
		System.out.println("Category:Mixer");
	}
}

public class SingleInheritanceDemo {

	public static void main(String[] args) {
		//Electronics obj=new Electronics();
		Mixer obj=new Mixer();
		obj.price();
		obj.deviceType();
		obj.category();

	}

}
