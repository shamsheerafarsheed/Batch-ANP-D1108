package oopsDemo;

import java.util.Scanner;

public class CourseList  extends StudentList{
	private int cid;
	private String cname;
	

	public int getCid() {
		return cid;
	}


	public void setCid(int cid) {
		this.cid = cid;
	}


	public String getCname() {
		return cname;
	}


	public void setCname(String cname) {
		this.cname = cname;
	}
	//ToString method-->String representation of object
	

	@Override
	public String toString() {
		return "CourseList [cid=" + cid + ", cname=" + cname + "StudentName:"+ getName() + ", StudentID:" +getSid() + ", Department:"+ getDept() +"]";
	}
	


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		CourseList A[]=new CourseList[1];
		for(int i=0;i<A.length;i++)
		{
			A[i]=new CourseList();
			//set the data
			System.out.println("Enter your course ID:");
			A[i].setCid(sc.nextInt());
			System.out.println("Enter Student Name:");
			A[i].setName(sc.next());
			System.out.println("Enter Student ID:");
			A[i].setSid(sc.nextInt());
			System.out.println("Enter Department Name:");
			A[i].setDept(sc.next());
			System.out.println("Enter course Name:");
			A[i].setCname(sc.next());
			//get the data
			System.out.println(A[i]+" ");
			
			
		}
		

	}


	


	


	
	

}
