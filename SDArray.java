package ArrayDemo;

public class SDArray {

	public static void main(String[] args) {
		// static way/literal way 
		String fruits[]= {"Apple","Banana","Kiwi","Mango"};
		System.out.println(fruits[3]);
		//1st way-->iterating elements from an array using for loop
		for(int i=0;i<fruits.length;i++)
		{
			System.out.println(fruits[i]);
		}
		//2nd way-->iterating elements from an array using foreach loop
		for(String  a:fruits)
		{
			System.out.println(a);
		}
		
		
		//Declare an array using new keyword-->allocate m/y at runtime
		int num[]=new int[5];
		num[0]=10;
		num[1]=20;
		
		num[2]=30;
		
		num[3]=40;
		num[4]=50;
		
		for(int i=0;i<5;i++)
		{
			System.out.println(num[i]);
		}
		for(int  number:num)
		{
			System.out.println(number);
		}
		
		
	}

}
