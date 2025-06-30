package constructorDemo;
/*
 * this--->keyword,represent a class
 * use object of class within the class itself
 * resolve name collision issue
 * used to make constructor stacking
 */

public class ThisDemo {
	//instance var
String name;
//constructor
ThisDemo(String name)//local var
{
this.name=name;
}
void show()
{
	System.out.println("Name:"+name);
}
	public static void main(String[] args) {
		ThisDemo obj=new ThisDemo("Shamsheera");//Set the value
		obj.show();

	}

}
