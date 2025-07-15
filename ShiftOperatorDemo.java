package operatorsDemo;

public class ShiftOperatorDemo {

	public static void main(String[] args) {
		// <<,>>
		//leftshift
		int a=8;
		int x=a<<2;//a*2^2=8*4=32
		
		System.out.println(x);
int y=a<<3;//a*2^3=8*8=64
		
		System.out.println(y);
				
	//RightShift
		
		int p=a>>2;//a/2^2=8/4=2
		
		System.out.println(p);
int s=a>>3;//a/2^3=8/8=1
		
		System.out.println(s);
		

	}

}
