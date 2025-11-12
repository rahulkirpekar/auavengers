package exceptiontopic;

import java.util.Scanner;

public class TestApp4 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter No1 : ");
		int no1 = sc.nextInt();//10
		System.out.println("Enter No2 : ");
		int no2 = sc.nextInt();//0
		
		int ans ;

		// Nested try catch
		try 
		{
			
			try 
			{
				ans = no1 / no2;// 10 / 0 ---code crashed
			} catch (Exception e) 
			{
				e.printStackTrace();
			}

			
			try 
			{
				String name = null;
				System.out.println(name.length());
				
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
		
			try 
			{
				int a[] = new int[5];
				a[5] = 100;
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
			
			try 
			{
				String value = "1a2b3";
				int no = Integer.parseInt(value);
				System.out.println("No : " +no);
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
			
		}catch(Exception e ) 
		{
			System.out.println("Exception catch Block Handled ");
		}
	}
}
