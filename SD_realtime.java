package ArrayDemo;

public class SD_realtime {

	public static void main(String[] args) {
		// 3 students 4  subjects each
		int[][] studentsmark= {
				{34,35,36,38},//stdnt1
				{44,35,46,38},//stdnt2
				{24,25,46,38}//stdnt3
		};
				for(int i=0;i< studentsmark.length;i++)
				{
					System.out.print("Student"+(i+1)+"Marks ");
					for(int j=0;j< studentsmark[i].length;j++)
					{
						
						System.out.print("Subject"+(j+1)+": "+studentsmark[i][j]);
					}
					System.out.println();
				}
	
		

	}

}
