package oops.consttopic;

public class Student 
{
	private int rno;
	private String name;
	private int std;
	private int marks;
	
	// Constructor---construct Object
/*
 * ===> ClassName and Constructor name must be same.
 * ===> Not any returntype
 * ===> Constructor called Implicitly when object create.
 * ===> By Two ways, we can create.
 * 		1. Default Constructor 
 * 		2. Para Constructor 
 * */
	
	// Default Constructor
	Student()
	{
		System.out.println("====START : Default Constructor====");

		System.out.println(rno+" " + name+" " + std+" " + marks);
		
		rno=1;
		name="Rahul Kirpekar";
		std=12;
		marks=100;
		
		System.out.println(rno+" " + name+" " + std+" " + marks);
		
		System.out.println("====EXIT : Default Constructor====");
	}
	// Para Constructor
	Student(int rno,String name,int std,int marks)
	{
		System.out.println("====START : Para Constructor====");
		System.out.println(rno+" " + name+" " + std+" " + marks);

		this.rno = rno;
		this.name= name;
		this.std = std;
		this.marks = marks;

		System.out.println(rno+" " + name+" " + std+" " + marks);
		System.out.println("====EXIT : Para Constructor====");
	}
	
	// Copy Constructor
	Student(Student s)
	{
		System.out.println("====START : COPY Constructor====");
		System.out.println(rno+" " + name+" " + std+" " + marks);
		rno = s.rno;
		name = s.name;
		std = s.std;
		System.out.println(rno+" " + name+" " + std+" " + marks);
		System.out.println("====EXIT : COPY Constructor====");
	}
	
	
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStd() {
		return std;
	}
	public void setStd(int std) {
		this.std = std;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public void dispData() 
	{
		System.out.println(rno+" " + name+" " + std+" " + marks);
	}
}
