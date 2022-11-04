package simplilearn.java.core;

public class DataTypeConversion
{

	public static void DataTypeConversionMain()
	{
		
		implicitDataTypeConversion();
		explicitDataTypeConversion();
	}
	
	private static void implicitDataTypeConversion()
	{
		int a = 100;
		System.out.println("Integer a is: " + a);
		
		long b = a;
		System.out.println("Implicit conversion of a to long b: " + b);
		
		float c = b;
		System.out.println("Implicit conversion of b to float c: " + c);
		
	}
	
	// Note that explicit conversion  is needed as we convert into "smaller space" (types)
	private static void explicitDataTypeConversion()
	{
		double d = 50.023;
		System.out.println("Double d is: " + d);
		
		float f = (float)d;
		System.out.println("Explicit conversion of d to float f: " + f);
		
		long l = (long)f;
		System.out.println("Explicit conversion of f to long l: " + l);
		
		int i = (int)l;
		System.out.println("Explicit conversion of l to int i: " + i);
		
		// here you see the lose of precision that occurred after it was turned into an int
		double dd = i;
		System.out.println("IMPLICIT conversion of i back to a double, dd: " + dd);
	
		
	}

}
