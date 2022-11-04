package simplilearn.java.core.polymorphism;

public class MethodOverloading
{
	
	public int multiply(int x, int y)
	{
		return (x * y);
	}
	
	public int multiply(int x, int y, int z)
	{
		return (x * y * z);
	}
	
	
	
	public int multiply(int arr[])
	{
		
		int result = arr[0];
		
		for(int i = 1; i < arr.length; i++)
		{
			result = result * arr[i];
		}
		
		return result;
	}
	
	public double multiply(double x,  double y)
	{
		return x * y;
	}
	


}
