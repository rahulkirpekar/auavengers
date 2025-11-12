package arraytopic;

import java.util.Scanner;

public class TestApp4 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int a[][] = new int[3][3];
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < 3; j++) 
			{
				System.out.println("Enter A["+i+"]["+j+"] : ");
				a[i][j] = sc.nextInt();
			}
		}
		int b[] = new int[3];
		for (int i = 0; i < a.length; i++) 
		{
			int rsum = 0,csum = 0;
			
			for (int j = 0; j < 3; j++) 
			{
				csum = csum + a[j][i];
				rsum = rsum + a[i][j];
				System.out.print("  "+a[i][j]+"\t");
			}
			b[i] = csum;
			System.out.print(" = "+rsum+"\n");
		}
		for (int i = 0; i < b.length; i++) 
		{
			System.out.print(" ="+b[i]+"\t");
		}
	}

}
