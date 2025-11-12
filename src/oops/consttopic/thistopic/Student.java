package oops.consttopic.thistopic;

public class Student 
{
	private int rno;
	private String name;
	private int std;

	public Student() 
	{
		System.out.println("Default Constructor");
	}
	public Student(int rno, String name) 
	{
		this();
		System.out.println("Para Constructor---Two");
		this.rno = rno;
		this.name = name;
	}

	public Student(int rno, String name, int std) 
	{
		this(rno, name);
		System.out.println("Para Constructor--Three");
		this.std = std;
	}
	public void dispData() 
	{
		System.out.println(rno+" " + name+" " + std);
	}
}
