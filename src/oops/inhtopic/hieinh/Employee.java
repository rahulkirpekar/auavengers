package oops.inhtopic.hieinh;

import java.util.Scanner;

public class Employee extends Person
{
	int id,salary;
	
	public void scanData() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enteer Id : ");
		id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enteer Name : ");
		name = sc.nextLine();
		System.out.println("Enteer Salary : ");
		salary = sc.nextInt();
	}
	public void dispData() 
	{
		System.out.println(id+" " + name+" " + salary);
	}

}
