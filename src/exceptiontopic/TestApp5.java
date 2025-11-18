package exceptiontopic;

import java.util.Scanner;

public class TestApp5 
{
	public static void isValidForVote(int age) throws InvalidAgeException
	{
		if (age < 18) 
		{
			// User wrong ---Input
			// raise ==> exception
			
			// UnChecked Exception
			throw new ArithmeticException("\nInvalid Age\n\tPlease enter age grater than 18.");
			
			// checked Exception---throws
//			throw new InvalidAgeException("\n\"Invalid Age\n\tPlease enter age grater than 18.\"");
			
		} else 
		{
			System.out.println("Welcome for Vote"); 
		}
	}
	public static void main(String[] args) //throws IOException
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Age for Voting :");
		int age = sc.nextInt();//17
		
		try 
		{
			isValidForVote(age);
		} catch (InvalidAgeException e) 
		{
			System.out.println("Catch Block Hanled Exception");
			e.printStackTrace();
		}
		System.out.println("Success");
	}
}