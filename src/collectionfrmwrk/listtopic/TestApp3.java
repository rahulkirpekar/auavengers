package collectionfrmwrk.listtopic;

import java.util.Iterator;
import java.util.Vector;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		Vector<String>list = new Vector<String>();
		
		list.add("rahul");//0
		list.add("ankur");//1
		list.add("rakesh");//2
		list.add("ramesh");//3
		list.add("sagar");//4
		list.add("vishv");//5

		Iterator<String> itr = list.iterator();
		
		while (itr.hasNext()) 
		{
			String name = (String) itr.next();
			System.out.println(name);
		}
	}
}
