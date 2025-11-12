package oops.abstopic.aclass.task2;

import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter below choice : ");
		System.out.println("1) For Home");
		System.out.println("2) For School");
		System.out.println("3) For Public Place");
		System.out.println("4) For Org");
		int choice= sc.nextInt();
		
		Person person = null;
		
		switch(choice) 
		{
			case 1: // Upcasting
					// Runtime Polymorphism
					// Polymorphic object
					person = new Home();
					person.getBehave();
					break;
					
			case 2: person = new School();
					person.getBehave();
					break;
					
			case 3: person = new PublicPlace();
					person.getBehave();
					break;
					
			case 4: person = new Org();
					person.getBehave();
					break;
		}
	}
}