package jdbctopic.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import jdbctopic.bean.StudentBean;
import jdbctopic.util.DBConnection;

public class StudentDao 
{
	// Insert Student---insert SQL Query
	public int insertStudent(StudentBean sbean) 
	{
		int rowsAffected = 0;
		String insertQuery = "INSERT INTO student(name,std,marks) VALUES('"+sbean.getName()+"',"+sbean.getStd()+","+sbean.getMarks()+")";

		System.out.println("insertQuery : " + insertQuery);
		
		// 1. get DB Connection object
		Connection conn = DBConnection.getConnection();
		
		// 2. validate conn object
		if (conn != null) 
		{
			Statement stmt = null;
			
			try 
			{
				// 3. create statement object by conn object
				stmt = conn.createStatement();
				
								// 4. execute SQL query
				rowsAffected = stmt.executeUpdate(insertQuery);
				
				
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
			
		} else 
		{
			System.out.println("StudentDao---insertStudent--Deb not connected : " + conn);
		}
		
		// return ack
		return rowsAffected;
	}
	public void updateStudent() 
	{

	}
	public void deleteStudent() 
	{

	}
	public void getAllStudents() 
	{

	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new  Scanner(System.in);
		
		System.out.println("Enter Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Std : ");
		int std = sc.nextInt();
		System.out.println("Enter Marks : ");
		int marks = sc.nextInt();
		
//		StudentBean sbean = new StudentBean(0, name, std, marks);
		StudentBean sbean = new StudentBean();
		
		sbean.setName(name);
		sbean.setMarks(marks);
		sbean.setStd(std);
		
		
		StudentDao dao = new StudentDao();
		
		int rowsAffected = dao.insertStudent(sbean);
		
		if(rowsAffected > 0) 
		{
			System.out.println("Student record successfully Inserted : " + rowsAffected);
		}else 
		{
			System.out.println("Student record not Inserted : " + rowsAffected);
			
		}
	}
}