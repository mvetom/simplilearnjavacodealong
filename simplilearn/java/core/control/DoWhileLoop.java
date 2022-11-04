package simplilearn.java.core.control;

public class DoWhileLoop
{
	public static void doWhileDemo()
	{
		int count = 1;
		
		do 
		{
			System.out.println("Count is: " + count);
			count++;
		}
		while(count < 10);
		
		System.out.println("Final Count is: " + count);
	}

}
