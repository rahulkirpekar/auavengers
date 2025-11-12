package oops.abstopic.interfacetopic.task1;

public interface A 
{
//	1.Dm's---Constant Variable--[public static final]
	
	int NO = 10;// public static final
	
//	2.Mf's
//		1. abstract method[public abstract]
	void test1();// public abstract 	
	
	
//		2. Non Abstract Method[static,default,private]
	
	// static method
	static void test2() 
	{
		System.out.println("static test2()");
	}
	// private method
	private void test3() 
	{
		System.out.println("private test3()");
	}
	// default method
	default void test4() 
	{
		test3();
		System.out.println("default test4()");
	}
}
