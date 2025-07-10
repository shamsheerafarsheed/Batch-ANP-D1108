package ArrayDemo;

public class MDArray {

	public static void main(String[] args) {
		// declaring MD array in aliteral way
		int marks[][]= {
				{45,46,34,47},
				{23,50,36,48},
				{32,35,37,38}
		};
		System.out.println(marks[0][1]);
		for(int i=0;i<marks.length;i++)
		{
			for(int j=0;j<marks[i].length;j++)
			{
				System.out.print(marks[i][j]+" ");
			}
			System.out.println();
		}

	}

}
