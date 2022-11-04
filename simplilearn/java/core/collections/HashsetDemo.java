package simplilearn.java.core.collections;

import java.util.*;

public class HashsetDemo
{
	
	
	private static Set<String> hashSet;
	
    static 
	{
	   hashSet = new HashSet<String>(5);
	}
	
	public static void hashsetMain()
	{
		
		// always put in an initial size ... if you're short on memory
		
		
		System.out.println("Can I add 'A' ? : " + addWorked("A"));
		System.out.println("Can I add 'B' ? : " + addWorked("B"));
		System.out.println("Can I add 'C' ? : " + addWorked("C"));
		System.out.println("Can I add 'C' ? : " + addWorked("C"));
		
		System.out.println("Set contains: " + hashSet);
		
		System.out.println("Set contains C? " + hashSet.contains("C"));
		
		hashSet.remove("A");
		
		System.out.println("Set after removing A: " + hashSet);
		
		// Just showing you can "foreach" over a hashset
		for(String item : hashSet)
		{
			System.out.println(item);
		}
		
	}

	// Can a new element be added
	private static String addWorked(String addMe)
	{
		
		if(hashSet.add(addMe))
		{
		    return "YES, Added Successfully!";
		}
		else
		{
			return "NO - Already In The Set!";
		}
		
	}

}
