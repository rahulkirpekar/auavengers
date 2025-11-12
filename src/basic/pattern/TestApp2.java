package basic.pattern;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		int no,fc=0;
		

		for(int j=1;j<=1000;j++) 
		{
			no = j;
			fc=0;
			for (int i = 1; i <=no; i++) 
			{
				if(no%i==0) 
				{
					fc++;
				}
			}
			if(fc==2) 
			{
				System.out.print(no+" ");
			}
		}
	}
}
