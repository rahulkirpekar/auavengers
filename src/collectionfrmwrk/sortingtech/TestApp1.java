package collectionfrmwrk.sortingtech;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		//  list		set		queue			map
		//   |		 |		  |		 	 	 |
		//	 X     TreeSet  PriorityQueue   TreeMap
		
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
/* Data
 	 	1.String
   		2.Primitive
		---------------------------
		3.Objects
*/
		
		Collections.sort(list);
		System.out.println("-------------------------------------------------------");
		
		itr = 	list.iterator();
		while(itr.hasNext()) 
		{
			String name= itr.next();
			System.out.println(name);
		}
	}
}
