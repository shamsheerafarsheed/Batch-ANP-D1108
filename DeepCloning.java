package ArrayDemo;

public class DeepCloning {

	public static void main(String[] args) {
		// Deep Copy-->copy of S D array
		int num[]= {23,45,67,89};
		int numcopy[]=num.clone();
		System.out.println(num);
		System.out.println(numcopy);
		System.out.println(numcopy==num);
		//System.out.println(num[0].equals(numcopy[0]));
		for(int i=0;i<4;i++) {
			System.out.println(numcopy[i]+" ");
		}
		System.out.println("original elements are:");
		for(int i=0;i<4;i++) {
			System.out.println(num[i]+" ");
		}
		
		

	}

}
