package simplilearn.java.core;

public class Operators
{
	public static void operatorsMain()
	{
		int result = 1 + 2;
		
		System.out.println("1 + 2 = " + result);
		
		int previous_result = result;
		
		result = result - 1;
		
		System.out.println(previous_result + " - 1 = " + result);
		previous_result = result;
		
		result = result *2;
		
		System.out.println(previous_result + " * 2 = " +  result);
		previous_result = result;
		
		result = result / 2;
		
		System.out.println(previous_result + " / 2 = " +  result);
		previous_result = result;
		
		result = result + 8;
		
		System.out.println(previous_result + " + 8 = " +  result);
		previous_result = result;
		
		
		result = result %  7;
		
		System.out.println(previous_result + " % 7 = " +  result);
		
		int i = 5;
		System.out.println("integer i is: " + i);
		
		System.out.println("integer ++i is: " + ++i);
		System.out.println("integer i is: " + i);
		System.out.println("integer i++ is: " + i++);
		System.out.println("integer i is: " + i);
		
		
		// bitwise operators
		
		System.out.println("\nBitwise operators example");
		bitwiseDemo();
		
		
	}
	
	public static void bitwiseDemo()
	{
		// Initial Values
		int a  = 5 ;  // 0101 in bytecode
		int b  = 7 ; // 0111 in bytecode
		
		// bitwise and:  Take each position ( in this case 0, 2, 4, 8 positions) in each number.
		// At each position compare the numbers at that position in each of the two numbers.  If both numbers
		// are 1, then in the resulting number,  the number at that position is 1.  Otherwise the number is 0.
		// For example,  for 5 and 7 - 0101 has '1' in position 0 (rightmost digit) and 0111 also has 1 in that position
		// so the rightmost digit of the result is also 1.  Taking that logic all the way up the numbers' positions....
		// (0101 & 0111) = 0101.   0101 = 5.
		System.out.println("a&b = " + (a & b));
		
		// bitwise or
		// Same concept as above,  except that we are checking to see if EITHER number
		// has a 1 in a given position, and if so putting a 1 in the corresponding point
		// in the result
		// (0101 | 0111) = 0111  = 7
		System.out.println("a|b = "  + (a | b));
		
		
	}

}
