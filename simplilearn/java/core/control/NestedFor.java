package simplilearn.java.core.control;

public class NestedFor
{

	public static void demoNestedFor()
	{
		int arr[][] = { { 2, 7, 9 }, { 3, 6, 1 }, { 7, 4, 2 } };

		System.out.println("Regular Version:");

		// Regular For Loops
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				System.out.print(arr[i][j] + " ");
			}

			System.out.println();
		}

		
		System.out.println();
		// Practical foreach For loop (Enhanced For Loop)
		System.out.println("Basically Java's foreach-style for loop:");
		for (int[] itemArr : arr)
		{
			for (int item : itemArr)
			{
				System.out.print(item + " ");
			}

			System.out.println();
		}

	}

}
