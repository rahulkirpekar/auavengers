package stringtopic.immutableway;

import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name :" );
								 //  0 1 2 3 4 
		String name =  sc.next();//  m a d a m
//								     i       j

		boolean flag = true;
		for (int i = 0 , j = (name.length()-1); i < args.length; i++,j--) 
		{
			if (name.charAt(i)!= name.charAt(j)) 
			{
				flag= false;
				break;
			}
		}
		if (flag) 
		{
			System.out.println(name + " is Palindrome.");
		} else 
		{
			System.out.println(name + " is Not Palindrome.");
		}
		
		
//		System.out.println("name.length() : " + name.length());// 5
		
//		System.out.println("name.charAt(0) : " + name.charAt(0));// r
//		System.out.println("name.charAt(1) : " + name.charAt(1));// a
//		System.out.println("name.charAt(2) : " + name.charAt(2));// h
//		System.out.println("name.charAt(3) : " + name.charAt(3));// u
//		System.out.println("name.charAt(4) : " + name.charAt(4));// l
		
		
		
		
	}
}
