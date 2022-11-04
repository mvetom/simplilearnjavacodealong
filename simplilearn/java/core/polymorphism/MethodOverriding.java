package simplilearn.java.core.polymorphism;

public class MethodOverriding
{
	public static void methodOverridingMain()
	{
		Bicycle bike = new Bicycle(10, 1);
		System.out.println("Bicycle gear is: " + bike.gear);
		System.out.println("Bicycle speed is: " + bike.speed);
		bike.applyBrake(1);
		System.out.println("Bicycle speed after applying break is: " + bike.speed);
		System.out.println("An individual parent object will now call the static method!");
		bike.statica();
	  
		System.out.println();
		
		MountainBike mountBike = new MountainBike(50, 3, 50);
		System.out.println("MountainBike gear is: " + mountBike.gear);
		System.out.println("MountainBike speed is: " + mountBike.speed);
		mountBike.applyBrake(1);
		System.out.println("MountainBike speed after applying break is: " + mountBike.speed);
	    mountBike.speedUp(10);
		System.out.println("MountainBike speed after speeding up:" + mountBike.speed);
		System.out.println("An individual child object will now call the static method!");
		mountBike.statica();
		
		Bicycle trailBike = new MountainBike(50, 3, 50);
		System.out.println("MountainBike-As-Bicycle gear is: " + trailBike.gear);
		System.out.println("MountainBike-As-Bicycle speed is: " + trailBike.speed);
		trailBike.applyBrake(1);
		System.out.println("MountainBike-As-Bicycle speed after applying break is: " + trailBike.speed);
	    trailBike.speedUp(10);
		System.out.println("MountainBike-As-Bicycle speed after speeding up:" + trailBike.speed);
		System.out.println("An individual child-AS-PARENT object will now call the static method!");
		// here's the surprise!
		trailBike.statica();
	}
}
