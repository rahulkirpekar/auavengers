package oops.encaps;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student();
		
		s1.setRno(1);
		s1.setName("rahul");
		s1.setStd(12);
		s1.setMarks(100);

		System.out.println(s1.getRno()+" " + s1.getName()+" " + s1.getStd()+" "+s1.getMarks());
		
	}
}
