package inheritanceDemo;
class Car
{
	public Car()
	{
		System.out.println("Class:Car");
	}
	public void VehicleType()
	{
		System.out.println("Vehicle Type:Car");
	}
}
class Toyota extends Car
{
	public Toyota()
	{
		System.out.println("Toyota Class");
	}
	public void Brand()
	{
		System.out.println("Brand:Toyota");
	}
	public void speed()
	{
		System.out.println("Max speed:120km/hr");
	}
}
class Taisor extends Toyota
{
	public Taisor()
	{
		System.out.println("Taisor class");	
	}
	public void speed()
	{
		System.out.println("Max speed:100km/hr");
	}
}

public class MultilevelInheritanceDemo {

	public static void main(String[] args) {
		Taisor t=new Taisor();
		t.Brand();
		t.speed();
		t.VehicleType();
		

	}

}
