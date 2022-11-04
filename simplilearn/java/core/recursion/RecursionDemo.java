package simplilearn.java.core.recursion;

public class RecursionDemo
{

	public static void recursionDemoMain()
	{
		ComplexFunction complexFunction = new ComplexFunction();
		int result = complexFunction.calculateFactorial(5);
		
		System.out.println("Factorial of 5 is : " + result);
		
	}

}
