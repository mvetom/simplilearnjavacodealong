package simplilearn.java.core.synchronization;

class Thread2 implements Runnable 
{

	  MathUtils mathy;
	  
	  public Thread2(MathUtils mathy) 
	  {
		  this.mathy = mathy;
	  }
	  
	  
	  public void run()
	   {
		   try 
		   {
			   mathy.getMultiples(3);
		   }
		   catch (Exception e)
		   {
			  // Throwing an exception
			   System.out.println("Exception is caught");
		   }
	   }

}
