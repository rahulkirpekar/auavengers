package jdbctopic.util;

import java.sql.*;

public class DBConnection 
{
	// 1. Make Credentials
	private static final String URLNAME          ="jdbc:mysql://localhost:3306/audb";
	private static final String DRIVERCLASS      ="com.mysql.cj.jdbc.Driver";
	private static final String USERNAME         ="root";
	private static final String PASSWORD			="root";
	
	
	// 2. create getConnection
	public static void getConnection() 
	{
		Connection conn = null;
		try 
		{
			// 3. Load Driver class
			Class.forName(DRIVERCLASS);
			
			// 4. pass credentials into DriverManager's getConnection
			conn = DriverManager.getConnection(URLNAME, USERNAME, PASSWORD);

			// 5. validate conn object
			if (conn != null) 
			{
				System.out.println("Db connected : " + conn);
			} else 
			{
				System.out.println("Db not connected : " + conn);
			}
			
		} catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		} catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
	}
	public static void main(String args[]) 
	{
		DBConnection.getConnection();
	}
}
