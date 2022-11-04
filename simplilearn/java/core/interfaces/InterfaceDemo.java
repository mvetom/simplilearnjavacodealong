package simplilearn.java.core.interfaces;

public class InterfaceDemo
{

	public static void interfaceDemoMain()
	{
		MountainBike bike = new MountainBike(20,1,10);
		System.out.println();
		
		System.out.println("Gear is: " + bike.getGear());
		System.out.println("Seat height is: " + bike.getSeatHeight());
		System.out.println("Bike speed is: " + bike.getSpeed());
		System.out.println();
		
		bike.applyBrake(1);
		System.out.println("Bike speed after applying break is: " + bike.getSpeed());
		
		bike.speedUp(10);
		System.out.println("Bike speed after speeding up is: " + bike.getSpeed());
		
		bike.canDrive();
		bike.canRotateTwoWheels();
		
	}

}
