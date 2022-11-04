package simplilearn.java.core.threads;

class Thread1 extends Thread
{
	@Override
	public void run()
	{
		try
		{
			System.out.println("Thread1 is running...");
		}
		catch(Exception e)
		{
			System.out.println("Hey! An Exception was thrown: " + e);
		}
		
	}
}
