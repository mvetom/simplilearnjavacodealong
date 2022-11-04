package simplilearn.java.core.polymorphism;

public class Bicycle
{
	int gear;
	protected int speed;
	
	public Bicycle(int startSpeed, int startGear)
	{
		gear = startGear;
		speed = startSpeed;
		System.out.println("I'm the parent Bicycle Constructor");
		System.out.println("As parent Constructor,  I will now call the static method!");
		statica();
	}
	
	
	public static void statica()
	{
		System.out.println("I'm the... PARENT static method!");
	}
	
	public void setGear(int newValue)
	{
		gear = newValue;
		System.out.println("I'm the parent Bicycle setGear method");
	}
	
	public void applyBrake(int decrement)
	{
		speed -= decrement;
		System.out.println("I'm the parent Bicycle applyBrake method");
	}
	
	public void speedUp(int increment)
	{
		speed += increment;
		System.out.println("I'm the parent Bicycle speedUp method");
	}
}
