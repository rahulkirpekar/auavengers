package arraytopic;

import java.util.Scanner;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
//		int a[][] = new int[2][3];
//		int [][]a = new int[2][3];
//		int[][] a = new int[2][3];
		int []a[] = new int[2][4];
		
		System.out.println(a.length);//2
		System.out.println(a[0].length);//3
		
		for (int i = 0; i < a.length; i++) 
		{
			int sum = 0;
			for (int j = 0; j < 3; j++) 
			{
				System.out.println("Enter A["+i+"]["+j+"] : ");
				a[i][j] = sc.nextInt();
				sum = sum + a[i][j];
			}
			a[i][3] = sum;
		}
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				System.out.println("A["+i+"]["+j+"] : " + a[i][j]);
			}
		}
	}
}