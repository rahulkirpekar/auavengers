package oops.inhtopic.mlinh;

import java.util.Scanner;

public class SciStudent  extends Student
{
	String subject;
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
		sc.nextLine();
		System.out.println("Enteer Subject Name : ");
		subject = sc.nextLine();
	}
	public void dispData() 
	{
		System.out.println(rno+" " + name+" " + std+" " + subject);
	}
}
