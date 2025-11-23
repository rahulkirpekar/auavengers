package collectionfrmwrk.listtopic;

import java.util.ArrayList;
import java.util.Iterator;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		// Typesafe
		ArrayList<String>list = new ArrayList<String>();
		
		list.add("rahul");//0
		list.add("ankur");//1
		list.add("rakesh");//2
		list.add("ramesh");//3
		list.add("sagar");//4
		list.add("vishv");//5

		Iterator<String> itr = 	list.iterator();
		while(itr.hasNext()) 
		{
			String name= itr.next();
			System.out.println(name);
		}
		System.out.println("------------------------");
//		list.remove(3);
		list.set(3, "Shiva");
		
		itr = 	list.iterator();
		while(itr.hasNext()) 
		{
			String name= itr.next();
			System.out.println(name);
		}
	}
}
