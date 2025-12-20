package multithreaddingtopic.bythread;

public class MyThread1 extends Thread
{
	// job defined
	@Override
	public void run() 
	{
		for (int i = 1; i <=3; i++) 
		{
			try 
			{
				Thread.sleep(500);
			} catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			System.out.println(i+"----" + Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) 
	{
		MyThread1 thread1 = new MyThread1();
		MyThread1 thread2 = new MyThread1();
		MyThread1 thread3 = new MyThread1();
		
		thread1.setName("C Language");
		thread2.setName("C++ Language");
		thread3.setName("Java Language");
		
		thread1.setPriority(Thread.MIN_PRIORITY);
		thread2.setPriority(Thread.MAX_PRIORITY);
		thread3.setPriority(Thread.MAX_PRIORITY);
		
		
		thread1.start();
		thread2.start();
		thread3.start();
	}
}
