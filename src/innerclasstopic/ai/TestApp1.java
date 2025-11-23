package innerclasstopic.ai;

public class TestApp1 
{
	public static void main(String[] args) 
	{
//		B obj = new B();
//		obj.test1();
		
		// Anonymous Innerclass
		A obj = new A()
		{
			@Override
			public void test1() 
			{
				System.out.println("A---test1()");
			}
		};
		
		System.out.println("Obj : " + obj);
		obj.test1();
	}
}
