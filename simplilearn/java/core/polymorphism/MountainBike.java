package simplilearn.java.core.polymorphism;

import simplilearn.java.core.polymorphism.Bicycle;

public class MountainBike extends Bicycle
{
	private int seatHeight;
	
	
	
	public MountainBike(int h, int g, int s)
	{
		super(s, g);
		seatHeight = h;
		System.out.println("I'm the child MountainBike constructor");
		System.out.println("I explicitly call super() (the parent Bicycle's method");
		System.out.println("As Child constructor,  I will now call the static method!");
		statica();
	}
	
	//@Override  -- illegal for static methods!
	// we just create a method of the same name as the parent and HIDE parent's
	// statica method!
	public static void statica()
	{
		System.out.println("I'm the... CHILD static method!");
	}

	@Override
	public void applyBrake(int decrement)
	{
		speed = speed - decrement-10;
		System.out.println("I'm the child MountainBike applyBrake method");

	}

	@Override
	public void speedUp(int increment)
	{
		speed = speed + increment + 10;
		System.out.println("I'm the child MountainBike speedUp method");

	}
	
	
	// getters and setters
	
	public int getSeatHeight()
	{
		return seatHeight;
	}

	public void setSeatHeight(int seatHeight)
	{
		this.seatHeight = seatHeight;
	}

	public int getGear()
	{
		return gear;
	}

	public void setGear(int newValue)
	{
		this.gear =  newValue + 2;
	}

	public int getSpeed()
	{
		return speed;
	}

	public void setSpeed(int speed)
	{
		this.speed = speed;
	}
}
