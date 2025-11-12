package oops.polymorphismtopic.compiletime;

// Method Overloadding---CompileTime Polymorphism
public class TestApp1 
{
	public void addFun(int no1,int no2) 
	{
		System.out.println("addFun(int no1,int no2) : " + (no1+no2));
	}
	public void addFun(int no1,int no2,int no3) 
	{
		System.out.println("addFun(int no1,int no2,int no3) : " + (no1+no2+no3));		
	}
	public void addFun(int no1,int no2,int no3,int no4) 
	{
		System.out.println("addFun(int no1,int no2,int no3,int no4) : " + (no1+no2+no3+no4));		
	}
	public static void main(String[] args) 
	{
		TestApp1 obj = new TestApp1();
		obj.addFun(20, 10);
		obj.addFun(20, 10,30);
		obj.addFun(20, 10,30,40);
	}
}
