package collectionfrmwrk.listtopic;

import java.util.ArrayList;
import java.util.Iterator;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// Dynamic Array
		ArrayList list = new ArrayList();

		// Implicit - when you store data into [list Object]
		//----------------------------------------------------
		// primitive values---object---jvm--->AUTO Boxing
		// Object--------->Primitive Values----UnBoxing
		
				    //  Primitive---Wrapperclass
					//      |		   |		
		list.add(true);//0--- boolean----Boolean 
		list.add('r'); //1--- char-------Character <===itr
		list.add("Royal");//2--- String
		list.add(10);//3--- int--Integer
		list.add(1200L);//4------long---Long
		list.add(45.543f);//5--- float---Float
		list.add(543.54);//6------double--Double
		
		Student s= new Student(1, "Rahul Kirpekar", 12);
		list.add(s);//7---Object
		
		System.out.println("list.size() : " + list.size());// 8
		
		Iterator itr = 	list.iterator();
		
		while(itr.hasNext()) 
		{
			Object obj = itr.next();
			if(obj instanceof Student) 
			{
				// Downcasting
				Student s1 = (Student)obj;
				System.out.println(s1.getRno()+" " + s1.getName()+" " + s1.getStd());
			}else 
			{
				System.out.println(obj);
			}
		}
/*
		 ----------------------------------------------
		for (int i = 0; i < list.size(); i++) 
		{
			Object obj = list.get(i);
			
			if(obj instanceof Student) 
			{
				// Downcasting
				Student s1 = (Student)obj;
				System.out.println(s1.getRno()+" " + s1.getName()+" " + s1.getStd());
				
			}else 
			{
				System.out.println("****"+i+"---"+obj);
			}
		}
//---------------------------------------------------------------------------------
		 Advanced for loop / Enhanced for loop / For Each loop
		
		for(Object obj : list)
		{
			if(obj instanceof Student) 
			{
				// Downcasting
				Student s1 = (Student)obj;
				System.out.println(s1.getRno()+" " + s1.getName()+" " + s1.getStd());
				
			}else 
			{
				System.out.println(obj);
			}
		}
//---------------------------------------------------------------------------------
 */
	
	
	
	}
}
