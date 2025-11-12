package exceptiontopic;

import java.util.Scanner;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter No1 : ");
		int no1 = sc.nextInt();//10
		System.out.println("Enter No2 : ");
		int no2 = sc.nextInt();//0
		
		int ans ;
		
		try 
		{
			ans = no1 / no2;// 10 / 0 ---code crashed
			
			String name = null;
			System.out.println(name.length());
		

			int a[] = new int[5];
			a[5] = 100;
			
			
			String value = "1a2b3";
			int no = Integer.parseInt(value);
			System.out.println("No : " +no);
			
		}
		catch(ArithmeticException e) 
		{
			// error log--exception
			e.printStackTrace();
			ans = 0;
			System.out.println("Catch Block Hanlded Exception : ArithmeticException");
		}
		catch(NullPointerException e) 
		{
			// error log--exception
			e.printStackTrace();
			ans = 0;
			System.out.println("Catch Block Hanlded Exception : NullPointerException");
		}
		catch(ArrayIndexOutOfBoundsException e) 
		{
			// error log--exception
			e.printStackTrace();
			ans = 0;
			System.out.println("Catch Block Hanlded Exception : ArrayIndexOutOfBoundsException");
		}		
		catch(Exception e) 
		{
			// error log--exception
			e.printStackTrace();
			ans = 0;
			System.out.println("Catch Block Hanlded Exception : Exception");
		}
		finally 
		{
			System.out.println("Finally Block");
		}

		System.out.println("Division : " + ans);
	}
}
