package simplilearn.java.core.streams;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.stream.Collectors;
import java.util.List;
import java.util.Set;

public class StreamDemo
{
	public static void streamDemoMain()
	{ 
		List<Integer> numbersList = new ArrayList<>();
		
		numbersList.add(10);
		numbersList.add(20);
		numbersList.add(30);
		numbersList.add(40);
		numbersList.add(30);  // duplicating to illustrate sets
		
		// old,  list way
//		List<Integer> squaresList = new ArrayList<>();
//		for(Integer i : numbersList)
//		{
//			squaresList.add(i*i);
//		}
		
		// new,  Java Stream way
		List<Integer> squaresList = numbersList.stream().map(x -> x*x).collect(Collectors.toList());
		System.out.println("LIST of Squared Members " + squaresList);
		
		// Now, do that for a Set instead...
		
		// Once again,  old way in Java.. using for loop
//		Set<Integer> squareSet = new HashSet<>();
//		for(Integer i : numbersList)
//		{
//			squareSet.add(i*i);
//		}
		
		Set<Integer> squareSet = numbersList.stream().map(x-> x*x).collect(Collectors.toSet());
		
		System.out.println("SET of Squared Members " + squareSet);
		
	// Filters...
		
		List<String> languages =  new ArrayList<>();
		languages.add("Scala");
		languages.add("Java");
		languages.add("Python");
		languages.add("FoxPro");
		languages.add("C#");
		languages.add("Perl");
		languages.add("Basic");
		
		// Now Get all elements that start with the letter "P"...
		
		// Old way...
		
//		List<String> pLanguages = new ArrayList<>();
//		for(String plangu: languages)
//		{
//			if(plangu.startsWith("P"))
//			{
//				pLanguages.add(plangu);
//			}
//		}
		
		List<String> pLanguages = languages.stream().filter(l -> l.startsWith("P")).collect(Collectors.toList());
		
		System.out.println("Languages that start with P....:");
		System.out.println(pLanguages);
		System.out.println();
		
		List<String> sortedLanguages = languages.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted Languages");
		System.out.println(sortedLanguages);
		System.out.println();
	    	
		
		//iterating and say for example... printing.. each element
		System.out.println("Printing all Comp Sci languages one by one!");
		languages.stream().forEach(y -> System.out.println("(This is the list with ONE statement in the forEach). Language Is: " + y));
		System.out.println();
		languages.stream().forEach(y -> 
		{
			System.out.println("(This the forEach with MULTIPLE Lines of Code)");
			System.out.println("Langauage is: " + y);
		});
		System.out.println();
		// Illustrating reduce();
		
		// sum up all the numbers - for loop
//		int sum = 0;
//		for(int num : numbersList)
//		{
//			sum = sum + num;
//		}
		
//		System.out.println("Sum of all elements in the numbersList: "  + sum);
		
		
//NOW TRY TO USE Stream's forEach() ....:-0
		
		
// uncomment this section and you'll see the side effects of Java's hardcore pass by value policy
		// IT EVEN INCLUDES Integer - even though Integer is the OBJECT version of int!!
		// Also ...s Integer is immutable!
//		Integer sum = 0;
		
//		add(sum, 5);
//		System.out.println(sum);
//		numbersList.stream().forEach(y -> add(sum , y));
//	System.out.println("Sum of all elements in the numbersList: "  + sum);
			
		
		
      // now see the extreme lengths to which we must go to get forEach to work...
//	  WrapperObject wrappedSum = new WrapperObject();
//	  wrappedSum.sum = 0;
//	  numbersList.stream().forEach(y -> addSum(wrappedSum , y));
//	  
//	  System.out.println("Sum of all elements in the numbersList: "  + wrappedSum.sum);
//		
	 //... and you can see why we abandon that approach and go with reduce!
	  	
	  int sum = numbersList.stream().reduce(0, (ans, i) -> ans + i);	
	  System.out.println("Sum of all elements in the numbersList: "  + sum);	
		
	}
	
	public static void addSum(WrapperObject sumWrapped,  int addThis)
	{ 
		
		sumWrapped.sum =  sumWrapped.sum + addThis;
		
	}
	
	
	public static void add(Integer first, int second )
	{
		System.out.print(first.intValue() + " = > ");
		first =  first.intValue() + second;
		System.out.println(first);
	}
}



