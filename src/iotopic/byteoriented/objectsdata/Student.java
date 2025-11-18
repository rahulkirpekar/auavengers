package iotopic.byteoriented.objectsdata;

import java.io.Serializable;

public class Student implements Serializable
{
	private int rno;
	private String name;
	private int std;
	private transient int marks;
	
	public Student(int rno, String name, int std, int marks) 
	{
		this.rno = rno;
		this.name = name;
		this.std = std;
		this.marks = marks;
	}
	public void dispData() 
	{
		System.out.println(rno+" " + name+" " + std+" " + marks);
	}
}
