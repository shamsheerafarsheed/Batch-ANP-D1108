package MethodDemo;
/*method is a small module,get called via object,method name can be anything and it
 *  will return a value
 *  if method is not returning anything--->void
 * 
 */
public class MethodCall {
	//void return type
	void mul(float a,int b)
	{
		System.out.println(a*b);
	}
//fn return integer value
	int mul1(int a,int b)
	{
		return a*b;
	}
	float modulus(float a,float b)
	{
		return a%b;
	}
	
	public static void main(String[] args) {
		// creating object
		MethodCall obj=new MethodCall();
		obj.mul(5.6f, 9);
		System.out.println(obj.mul1(12, 45));
		System.out.println(obj.modulus(125.5f, 45));

	}

}
