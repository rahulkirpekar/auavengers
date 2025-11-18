package iotopic.byteoriented.stringdata;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

// 1. Byte oriented way----String--data---write---FIle
//------------------------------------------------------
public class TestApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name : ");
		String name = sc.nextLine(); // "ABC"
		
		// Data---name(String)----convert into Byte-----?
		byte b[] = name.getBytes();//b[0]-65,b[1] = 66,b[2] = 67
		
		try 
		{
		//	1. Open File Connection
			FileOutputStream fout = new FileOutputStream("list.txt");
			
			fout.write(b);
			
			fout.close();
			
			System.out.println("success");
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
