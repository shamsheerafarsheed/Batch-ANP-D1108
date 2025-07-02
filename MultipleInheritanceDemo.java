package inheritanceDemo;
//subclass are accessing more than one class -->multiple inheritance(can do with interface only)

public class MultipleInheritanceDemo implements Readable,Writable{
	
	public void reads() {
		
		System.out.println("I can read");
	}
	
	public void write() {
		System.out.println("I can write");
		
	}

	public static void main(String[] args) {
		// we cant create an object of Interface
		//Readable obj=new Readable();
		MultipleInheritanceDemo obj=new MultipleInheritanceDemo();
		obj.reads();
		obj.write();

	}

	

	

}
