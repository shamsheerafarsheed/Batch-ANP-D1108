package ArrayDemo;

import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//Take array Size
		System.out.println("Enter the number of elements");
		int n=sc.nextInt();
		int []arr=new int[n];
		//take aray input from the user
		System.out.println("Enter "+ n +"integers");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		// print elements in an array using foreach loop
		for(int num:arr)
		{
		
		System.out.print(num+" ");

	}
		//bubble sort Algorithm
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1-i;j++)
			{
				if (arr[j]>arr[j+1])
				{
					//swap arr[j] and arr[j+1]
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
			}
		}
		//print the sorted array
		System.out.print("Sorted Aray in Ascending order:");
		
		for(int sort_num:arr)
		{
		
		System.out.print(sort_num+" ");
}
		sc.close();
}}