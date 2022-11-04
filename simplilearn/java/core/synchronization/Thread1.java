package simplilearn.java.core.synchronization;

class Thread1 extends Thread 
{
	MathUtils mathy;
	
	public Thread1(MathUtils mathy)
	{
		this.mathy = mathy;
	}
	
	@Override
	public void run()
	{
		try
		{
			mathy.getMultiples(2);
		}
		catch(Exception e)
		{
			System.out.println("Hey! An Exception was thrown: " + e);
		}
		
	}
}
