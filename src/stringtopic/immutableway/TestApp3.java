package stringtopic.immutableway;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		String name= "royal";
		
		StringBuilder sb1 = new StringBuilder(name);
		System.out.println("sb1 : " +sb1);
		
		sb1.reverse();
		System.out.println("sb1.reverse() : " + sb1.toString());
		
		
		StringBuffer sb2 = new StringBuffer(name);
		System.out.println("sb2 : " +sb2);

		
		
//		String v1 = "123";
//		int no1 = 	Integer.parseInt(v1);
//		System.out.println(no1+2000);
		
//		other type data--->	String data
//		String noStr1 = String.valueOf(123);
//		System.out.println(noStr1+2000);
		
//		String stmt = "royal technosoft is Software Traning Institute.";
//		char v[] = stmt.toCharArray();
//		for (int i = 0; i < v.length; i++) 
//		{
//			System.out.println("v["+ i +"] : " + v[i]);
//		}
		
//		System.out.println("Result : " + stmt.contains("technosoft"));
		
//		String words[] =	value.split("\\s");
//		System.out.println("Total Words : " + words.length);
//		// Advanced for loop / for each / Enhanced for..loop
//		for (String word : words) 
//		{
//			System.out.println(word);
//		}
		
//		System.out.println(value+"---"+value.length());// royal---5
//		value = value.trim();// royal
//		System.out.println(value+"---"+value.length());// royal---5
	}
}
