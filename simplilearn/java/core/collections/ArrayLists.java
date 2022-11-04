package simplilearn.java.core.collections;

import java.util.*;

public class ArrayLists
{

	public static void arrayListsMain()
	{
		
		// BEST PRACTICE.  Initialize as the interface... in case you
		// need to initialize a different type of that interface, 
		// in this case,  another kind of LIST - at some later point.
		List<Integer> arrayList = new ArrayList<Integer>(5);  // <-- It's also Best Prac. to set an initial size
		                                                
		
		// note that I am putting in one more element then the list's initial size
		// - and it is going to handle it JUST FINE!
		for(int i = 1; i <= 6; i++)
		{
			arrayList.add(i);
		}
		
		// Printing Elements
		System.out.println(arrayList);
		
		// Remote element at index 3
		arrayList.remove(3);
		
		// Displaying the ArrayList
		// after deletion
		System.out.println(arrayList);
		
		
		
		// Printing the elements one by one
		for(int i = 0; i < arrayList.size(); i++)
		{
			System.out.print(arrayList.get(i) + " ");
			
		}
		
		System.out.println();
		
		arrayList.add(5555);
		
		// same result as previous loop above - but lest verbose code - in the style of "foreach" / EnHanced for loop
		for(int num  : arrayList)
		{
			System.out.print(num + " ");
		}
		
		
	}

}
