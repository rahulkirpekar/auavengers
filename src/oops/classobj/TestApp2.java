package oops.classobj;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		int a[] = new int[5];
		
		Student s[] = new Student[5];

		System.out.println("s Array Object : " + s);
		for (int i = 0; i < s.length; i++) 
		{
			s[i] = new Student();
			s[i].scanData();
		}		

		for (int i = 0; i < s.length; i++) 
		{
			s[i].dispData();
		}		
	}
}
