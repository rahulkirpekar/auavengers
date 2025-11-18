package iotopic.byteoriented.stringdata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestApp2 
{
	public static void main(String[] args) 
	{
//		StringBuilder sb = new StringBuilder();
		int objectCount = 1 ;
		String name = "";
		try 
		{
			FileInputStream fin = new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\auavengers\\list.txt");

			int temp;

			while( (temp = fin.read())	!=  -1) 
			{
				char value = (char)temp;
				
				name = name + value;
				
				System.out.println(name+"---"+name.hashCode());
//				sb.append(value);
				objectCount++;
			}
			
			fin.close();
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
//		System.out.println("Final String : " + sb.toString());
		
		System.out.println("Final String : " + name+"---"+name.hashCode() +"----"+objectCount);
	}
}
