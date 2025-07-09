package StringDemo;

public class StringBufferDemo {
	//String Buffer/StringBuilder is mutable

	public static void main(String[] args) {
	//	StringBuffer str=new StringBuffer("");
		StringBuilder str=new StringBuilder("Wlcome for java session");
		System.out.println(str);
		//insert
		str.insert(1,'e');
		System.out.println(str);
		//append
		str.append(" Dear Students");
		System.out.println(str);
		str.delete(16, 24);
		System.out.println(str);
		str.replace(8, 11, "to");
		System.out.println(str);

	}

}
