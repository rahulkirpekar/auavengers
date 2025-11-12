package oops.consttopic;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Student s1= new Student(1, "Sagar", 12, 90);
		s1.dispData();
		
		Student s2 = new Student(s1);
		s2.dispData();		
		
		
//		Student s1= new Student();// s1=[rno name std marks]
//		Student s2= new Student();// s2=[rno name std marks]
//		Student s3= new Student();// s2=[rno name std marks]
//		Student s4= new Student();// s3=[rno name std marks]
//		Student s5= new Student();// s5=[rno name std marks]

//		s1.dispData();
//		s2.dispData();
//		s3.dispData();
//		s4.dispData();
//		s5.dispData();
		
//		s1.setRno(1);
//		s1.setName("Rahul");
//		s1.setStd(12);
//		s1.setMarks(100);
		
//		System.out.println(s1.getRno()+" " + s1.getName()+" " + s1.getStd()+" " + s1.getMarks());
	}
}
