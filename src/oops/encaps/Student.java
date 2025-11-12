package oops.encaps;

import java.util.Scanner;

//  Data Security
//      |
//------------------
// Pure Encapsulation = [1. Dm-s-->private  2. Mf''s --public]
// class--User Defined DataType
public class Student 
{
	// 1. Data Members---store--Data 
	private int rno,std,marks;
	private String name;
	
	// 2. Member Function
	
	// setters---Mutators
	// getters--Accessors
	public void setRno(int rno) 
	{
		this.rno = rno;
	}
	public int getRno() 
	{
		return rno;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getName() 
	{
		return name;
	}
	
	
	public void setStd(int std) 
	{
		this.std = std;
	}
	public int getStd() 
	{
		return std;
	}
	
	public void setMarks(int marks) 
	{
		this.marks = marks;
	}
	public int getMarks() 
	{
		return marks;
	}
	
	
	
	public void scanData() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rno : ");
		rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		name = sc.nextLine();
		System.out.println("Enter Std : ");
		std = sc.nextInt();
		System.out.println("Enter Marks : ");
		marks = sc.nextInt();
	}
	public void dispData() 
	{
		System.out.println(rno+" " + name+" " + std+" " + marks);
	}
	// 2. Member Function--operation--->Data
//	public static void main(String[] args) 
//	{
//		Scanner sc = new Scanner(System.in);
////				Student s1 = new Student() , s2 = new Student();
//		// s1---reference variable
//		// Student---Object
//		
//		Student s1 = new Student();// s1-->[rno name std]
//		Student s2 = new Student();// s2-->[rno name std]
//
//		s1.scanData();
//		s2.scanData();
//		
//		s1.dispData(); 
//		s2.dispData(); 
//	}
}

