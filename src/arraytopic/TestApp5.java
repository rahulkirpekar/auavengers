package arraytopic;

import java.util.Scanner;

public class TestApp5 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int a[][][] = new int[2][2][3];

		System.out.println(a.length);//2 Student
		System.out.println(a[0].length);//2 sem
		System.out.println(a[0][0].length);//Subject
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				for (int k = 0; k < a[i][j].length; k++) 
				{
					System.out.println("Enter A["+i+"]["+j+"]["+k+"] : ");
					a[i][j][k] = sc.nextInt();
				}
			}
		}
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				for (int k = 0; k < a[i][j].length; k++) 
				{
					System.out.println("A["+i+"]["+j+"]["+k+"] : " + a[i][j][k]);
				}
			}
		}
	}
}
