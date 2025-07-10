package ArrayDemo;

public class ShallowCopy_clone {

	public static void main(String[] args) {
		// Shallow copy
		int num[][]= {
				{1,2,3,4},
				{5,6,7,8}
		};
		int clonenum[][]=num.clone();
		System.out.println(num[0]);
		System.out.println(clonenum[0]);
		System.out.println(num[1]==clonenum[1]);
		System.out.println(num[1].equals(clonenum[1]));
	}

}
