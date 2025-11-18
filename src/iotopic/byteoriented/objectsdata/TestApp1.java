package iotopic.byteoriented.objectsdata;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student(1, "Rahul Kirpekar", 10, 100);
		
		// Auto-Closable Resource--Java-7
		try 
			(
					FileOutputStream fout = new FileOutputStream("list.txt");
					ObjectOutputStream out = new ObjectOutputStream(fout);
			)
		{
			// Object---Byte---[writeObject]
			out.writeObject(s1);
			
			System.out.println("Success");
		
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}