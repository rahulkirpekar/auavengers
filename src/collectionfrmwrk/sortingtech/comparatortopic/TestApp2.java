package collectionfrmwrk.sortingtech.comparatortopic;

import java.util.ArrayList;
import java.util.Collections;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student(1, "rahul", 12, 100);
		Student s2 = new Student(2, "ankur", 11, 90);
		Student s3 = new Student(3, "sagar", 10, 100);
		Student s4 = new Student(4, "kunal", 9, 80);
		Student s5 = new Student(5, "ramesh", 8, 60);
		
		ArrayList<Student> list = new ArrayList<Student>();
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);

		for(int i = 0 ; i< list.size();i++) 
		{
			Student s= list.get(i);
			s.dispData();
		}
		
		Collections.sort(list, new StdWiseStudentComparator());
		System.out.println("-----------------------------");
		System.out.println("Std wise Student Sorting : ");
		for(int i = 0 ; i< list.size();i++) 
		{
			Student s= list.get(i);
			s.dispData();
		}
		Collections.sort(list, new NameWiseStudentComparator());
		System.out.println("-----------------------------");
		System.out.println("Name wise Student Sorting : ");
		for(int i = 0 ; i< list.size();i++) 
		{
			Student s= list.get(i);
			s.dispData();
		}
		Collections.sort(list, new MarksWiseStudentComparator());
		System.out.println("-----------------------------");
		System.out.println("Marks wise Student Sorting : ");
		for(int i = 0 ; i< list.size();i++) 
		{
			Student s= list.get(i);
			s.dispData();
		}
	}
}
