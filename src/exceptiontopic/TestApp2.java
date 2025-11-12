package exceptiontopic;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		// Parent Reference
		A obj = null;
		
		
		// Upcasting = [Parent reference = Child Object]
		obj = new C();
		obj.test1();
		
		//obj.testB();// C.E
		

		if(obj instanceof B) 
		{
			// ownership---Downcasting
			B objB = (B)obj;// B object
			objB.testB();
			
		}else if(obj instanceof C) 
		{
			// ownership---Downcasting
			C objC = (C)obj;// C object
			objC.testC();
		}
		
		obj = new B();
		C obj1 = (C)obj;
	}
}
