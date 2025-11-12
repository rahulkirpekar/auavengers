package oops.inhtopic.sinh;

import java.util.Scanner;

// Single Inheritance
//--------------------
// Child Class			     Parent Class
public class Student extends Person
{
	int rno,std;
	
	public void scanData() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enteer Rno : ");
		rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enteer Name : ");
		name = sc.nextLine();
		System.out.println("Enteer Std : ");
		std = sc.nextInt();
	}
	public void dispData() 
	{
		System.out.println(rno+" " + name+" " + std);
	}
	
}
