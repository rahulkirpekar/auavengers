package collectionfrmwrk.settopic;

import java.util.HashSet;
import java.util.Iterator;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		HashSet<String> set = new HashSet<>();
		
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
