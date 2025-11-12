package arraytopic;

import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// a[0],a[1],a[2],a[3],a[4]
		// Array Declaration
		int a[] = new int[5];
//		int []a2 = new int[5];
//		int[] a3 = new int[5];
		// Array Declaration With Initialisation
//		int a4[] = {10,20,30,40,50};
//		int a5[] = new int []{10,20,30,40,50};
		
		
		System.out.println("a.length : " +a.length);

		for (int i = 0; i < a.length; i++) 
		{
			System.out.println("Enter A["+ i +"] : ");
			a[i] = new Scanner(System.in).nextInt();
		}
		// Acsending order---Selection Sort / Bubble Sort
		for(int i = 0 ; i < a.length;i++) 
		{
			for (int j = (i+1); j < a.length; j++)
			{
				if(a[i] < a[j]) 
				{
					int temp;
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			} 
		}
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println("A["+ i +"] : " + a[i]);
		}
	}
}