package iotopic.byteoriented.objectsdata;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Student s[] = new Student[3];
		
		for (int i = 0; i < s.length; i++) 
		{
			System.out.println("Enter Rno : ");
			int rno = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Name : ");
			String name = sc.nextLine();
			
			System.out.println("Enter Std : ");
			int std = sc.nextInt();
			
			System.out.println("Enter Marks : ");
			int marks= sc.nextInt();
			
			s[i]= new Student(rno, name, std, marks);
		}

		try 
				(
				FileOutputStream fout = new FileOutputStream("royallist.txt");
				ObjectOutputStream out= new ObjectOutputStream(fout);
				)
		{
			
			out.writeObject(s);
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		System.out.println("success");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
