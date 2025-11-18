package iotopic.charoriented;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestApp4 
{
	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer();
		try 
		{
			FileReader fr = new FileReader("C:\\Users\\Royal\\eclipse-workspace\\auavengers\\royal.txt");
			
			int temp;
			
			while((temp = fr.read()) != -1) 
			{
				sb.append((char)temp);
			}
			fr.close();
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		System.out.println("Final String : " + sb.toString());
	}
}