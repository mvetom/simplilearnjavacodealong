package simplilearn.java.core.synchronization;

public class SyncDemo
{
	public static void syncDemoMain()
	{
		MathUtils obj = new MathUtils();
		
		Thread1 t1 = new Thread1(obj);
		Thread t2 = new Thread(new Thread2(obj));
		
		t1.start();
		t2.start();
	}
}
