package simplilearn.java.core.nested;

public class AnonymousInnerClassDemo
{
	
	public static void anonyMain()
	{
		Bicycle bike = new MountainBike();
		bike.canApplyBreak();
		bike.canSpeedUp();
		
		//Basically the same thing, but with an anonymous class
		Bicycle bikeAnon = new Bicycle() 
				{

					@Override
					public void canSpeedUp()
					{
						System.out.println("Speeding in... in what I have to say is a very JavaScript-y way!  Anonymous Class!");
						
					}

					@Override
					public void canApplyBreak()
					{
						System.out.println("Slowing down... in Anonymous Class!");
						
						
					}
			
				};
				
				bikeAnon.canApplyBreak();
				bikeAnon.canSpeedUp();
	}
}
