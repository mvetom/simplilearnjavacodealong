package simplilearn.java.core.interfaces;

public class MountainBike extends TwoWheeler implements Bicycle, Vehicle 
{
	
	private int seatHeight;
	
	private int gear;
	private int speed;
	
	
	public MountainBike(int h, int g, int s)
	{
		seatHeight = h;
		gear = g;
		speed = s;
	}

	@Override
	public void applyBrake(int decrement)
	{
		speed = speed - decrement;

	}

	@Override
	public void speedUp(int increment)
	{
		speed = speed + increment;

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

	public void setGear(int gear)
	{
		this.gear = gear;
	}

	public int getSpeed()
	{
		return speed;
	}

	public void setSpeed(int speed)
	{
		this.speed = speed;
	}

	@Override
	public void canDrive()
	{
		System.out.println("Mountain bike can be driven");
		
	}


}
