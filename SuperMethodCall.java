package SuperDemo;
class Fruits
{
	void eat()
	{
		System.out.println("I love to eat  Fruits");
	}
}
class Mango extends Fruits
{
	void eat()
	{
		System.out.println("I love to eat  Mango becuase it is tasty");
	}
	void Drink()
	{
		
			System.out.println("we can make juice with mango");
		
	}
	void supermthd()
	{
		super.eat();
	}
}


public class SuperMethodCall {

	public static void main(String[] args) {
		Mango m=new Mango();
		m.Drink();
		m.eat();
		m.supermthd();

	}

}
