package simplilearn.java.core.threads;

public class ConcurrencyThreadsDemo
{
	public static void threadsDemoMain()
	{
		int n = 10; // number of threads
		for(int i=0; i < n; i++)
		{
			Thread1 t1 = new Thread1();
			t1.start();
			
			Thread t2 = new Thread(new Thread2());
			t2.start();
		}
	}
}
