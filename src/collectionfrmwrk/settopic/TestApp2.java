package collectionfrmwrk.settopic;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		// Maintain Insertion order and remove duplicate values
		LinkedHashSet<String> set = new LinkedHashSet<>();
		
		set.add("rahul");//0
		set.add("ankur");//1
		set.add("rakesh");//2
		set.add("ramesh");//3
		set.add("sagar");//4
		set.add("vishv");//5
		set.add("rahul");//6
		set.add("ankur");//7
		set.add("rakesh");//8

		Iterator<String> itr =	set.iterator();
		
		while (itr.hasNext()) 
		{
			String name = (String) itr.next();
			System.out.println(name);
		}
	}
}
