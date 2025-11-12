package basic;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// 1. Initialisation
		// 2. condittion
		// 3. operation
		// 4. inc/dec
		
		int i = 1, sum = 0;
		
		do 
		{
			System.out.println(i);
			
			sum += i;
			
			i++;
			
		}while( i <= 5 );

		System.out.println("Sum : " + sum);
	}
}
