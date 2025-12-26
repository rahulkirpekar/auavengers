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
	public int updateStudent(StudentBean s , int id) 
	{
		String updateQuery = "UPDATE student SET name='"+s.getName()+"',std="+s.getStd()+",marks="+s.getMarks()+" WHERE id="+id;
		
		System.out.println("updateQuery : " + updateQuery);
		
		Connection conn = DBConnection.getConnection();
		Statement stmt = null;
		int rowsAffected = 0;
		if (conn!=null) 
		{
			try 
			{
				stmt = conn.createStatement();
			
				rowsAffected = stmt.executeUpdate(updateQuery);
				
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("StudentDao--Db not conected");
		}
		return rowsAffected;
	}
	public int deleteStudent(int id) 
	{
		String deleteQuery = "DELETE from student WHERE id = "+id;
		
		Connection conn = DBConnection.getConnection();
		
		Statement stmt = null;
		
		int rowsAffected = 0;
		
		if (conn!=null) 
		{
			try 
			{
				stmt = conn.createStatement();
				
				rowsAffected = stmt.executeUpdate(deleteQuery);
				
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} else 
		{
			System.out.println("StudentDao---deleteStudent() Db not connected : " + rowsAffected);
		}
		return rowsAffected;
	}
	public void getAllStudents() 
	{

	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new  Scanner(System.in);

		System.out.println("Enter Student Id which you want to Update  : ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Std : ");
		int std = sc.nextInt();
		System.out.println("Enter Marks : ");
		int marks = sc.nextInt();
		
		StudentBean sbean = new StudentBean(0, name, std, marks);
		
		StudentDao dao = new StudentDao();
		
		int rowsAffected = dao.updateStudent(sbean,id);
		
		if(rowsAffected > 0) 
		{
			System.out.println("Student record successfully Updated : " + rowsAffected);
		}else 
		{
			System.out.println("Student record not Updated : " + rowsAffected);
		}
		
/*		System.out.println("Enter Student Id which you want to Delete  : ");
		int id = sc.nextInt();
		
		StudentDao dao = new StudentDao();
		
		int rowsAffected = dao.deleteStudent(id);
		
		if(rowsAffected > 0) 
		{
			System.out.println("Student record successfully Deleted : " + rowsAffected);
		}else 
		{
			System.out.println("Student record not Deleted : " + rowsAffected);
		}
		----------------------------------------------------------------------------------
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
*/	}
}