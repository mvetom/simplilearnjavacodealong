package simplilearn.java.core.control;


import java.util.Scanner;

public class IfStatement
{

	public static void ifStatementMain()
	{
		Scanner input = new Scanner(System.in);
				
		int testScore = 0;
		int nextScore = 0;
		
		System.out.println("Enter a grade");

		testScore = input.nextInt();
		System.out.println("Enter another grade");
		
		nextScore = input.nextInt();
		
		input.close();
		
		ifElseIfDemo(testScore);
		
		nestedIf(testScore);
		
		TernaryOperatorDemo(testScore, nextScore);
		
		
		
	}

	private static void TernaryOperatorDemo(int a, int b)
	{
		int biggerScore;
		
		biggerScore = a > b ? a : b;
		
		System.out.println("Your biggest score was: " + biggerScore);
	}

	private static void nestedIf(int score)
	{
		if (score == 50)
		{
			System.out.println("Score is 50");
		}
		else
		{
			if(score < 75)
			{
				System.out.println("Score is less than 75");
				if(score < 55)
				{
					System.out.println("Score is also less than 55");
				}
			}
		}
		
	}

	private static void ifElseIfDemo(int testScore)
	{
		
		char grade;
		//System.out.println(testScore);
		if(testScore >= 90)
		{
			grade = 'A';
		}
		else if(testScore >= 80)
		{
			grade =  'B';
		}
		else if(testScore >= 70)
		{
			grade =  'C';
		}
		else if(testScore >= 60)
		{
			grade =  'D';
		}
		else
		{
			grade = 'F';
		}
		
		System.out.println("Your grade is: " +  grade);
	}

}
