package simplilearn.java.core.recursion;

public class ComplexFunction
{
	
    //  Let's pause to acknowledge that the exit
	// case (n = 1) will never occur (and thus throw an
	// infinite loop)  in the case that you get a negative number
	// Illustrates how easy it is to make a mistake in choosing
	// your recursion exit strategy
	static int calculateFactorial(int n)
	{
		if(n == 1)
		{
			return 1;
		}
		else
		{
			return (n * calculateFactorial(n-1));
		}
	}
}
