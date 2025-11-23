package collectionfrmwrk.queuetopic;

import java.util.LinkedHashSet;
import java.util.PriorityQueue;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// Natural Ordering
		PriorityQueue<String> queue = new PriorityQueue<>();
		
		queue.add("rahul");//0
		queue.add("ankur");//1
		queue.add("rakesh");//2
		queue.add("ramesh");//3
		queue.add("sagar");//4
		queue.add("vishv");//5

		while(!queue.isEmpty()) 
		{
			String name = queue.poll();
			System.out.println(name);
		}
	}
}
