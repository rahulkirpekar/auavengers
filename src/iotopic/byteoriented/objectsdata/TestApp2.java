package iotopic.byteoriented.objectsdata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		try 
			(
				FileInputStream fin = new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\auavengers\\list.txt");
				ObjectInputStream oin  = new ObjectInputStream(fin);
			)
		{
			
//			Object obj = oin.readObject();
//			Student s = (Student)obj;
//			s.dispData();
			
//			Student s = (Student)oin.readObject();
//			s.dispData();
			
			((Student)oin.readObject()).dispData();
		
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
