package MethodDemo;
//if method is static we can call without object
public class StaticDemo {
static void display()
{
	System.out.println("We are learning Java..");
}
static void display(int a)
{
	System.out.println("We are learning Java.."+a);
}
static void display(int b,float c)
{
	System.out.println(b+c);
			
}
	public static void main(String[] args) {
		display();
		display(8);
		display(8,67.8f);
	}
	

}
