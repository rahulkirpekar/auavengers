package collectionfrmwrk.maptopic;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// Map---data---store---[Key,Value]---Entry
		//--------------------------------------------
//		HashMap---Not Maintain Insertion order
		
//		HashMap<Integer, String> mapObj = new HashMap<Integer,String>();
		
//		LinkedHashMap---Maintain Insertion order
//		LinkedHashMap<Integer, String> mapObj = new LinkedHashMap<Integer,String>();
		
//		TreeMap--Sorting By Ascensing Order
		TreeMap<Integer, String> mapObj = new TreeMap<Integer,String>();
		
		mapObj.put(11, "Rahul");// [K,V]---Entry
		mapObj.put(2, "Ankur");// [K,V]---Entry
		mapObj.put(31, "Sagar");// [K,V]---Entry
		mapObj.put(4, "Krunal");// [K,V]---Entry
		mapObj.put(51, "Sujal");// [K,V]---Entry
		

		for(	Map.Entry<Integer, String> e :	mapObj.entrySet()) 
		{
			System.out.println(e.getKey()+" " + e.getValue());
		}	
	}
}
