package simplilearn.java.core.inheritance;

public class InheritanceDemo
{

	public static void inheritanceDemoMain()
	{
		MountainBike moBike = new MountainBike(20, 10, 1);
		System.out.println("Gear is:" + moBike.gear);
		System.out.println("Seat Height is:" + moBike.seatHeight);
		System.out.println("Bike speed is:" + moBike.speed);
		moBike.applyBrake(1);
		System.out.println("Bike speed after applying brake is:" + moBike.speed);
	}

}
