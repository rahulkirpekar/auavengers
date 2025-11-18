package iotopic.byteoriented.stringdata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		try 
		{
			FileInputStream fin = new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\auavengers\\src\\iotopic\\byteoriented\\stringdata\\TestApp1.java");

			FileOutputStream fout = new FileOutputStream("TestApp4.java");
			
			int temp;
			
			while((temp = fin.read()) != -1) 
			{
				System.out.print((char)temp);
				fout.write(temp);
			}
			fin.close();
			fout.close();
			
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
