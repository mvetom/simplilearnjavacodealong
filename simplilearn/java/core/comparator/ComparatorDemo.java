package simplilearn.java.core.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorDemo
{

	public static void comparatorDemoMain()
	{
		  ArrayList<Student> list = new ArrayList<Student>();
		  Student john = new Student(3, "John", 18);
		  Student jane = new Student(1, "Jane", 21);
		  Student tom = new Student(2, "Tom", 20);
		  
		  
		  list.add(john);
		  list.add(jane);
		  list.add(tom);
		  
		  Collections.sort(list);

		  System.out.println("Students sorted by roll # using the Student's 'natural' sort order : ");
		  System.out.println("(Our custom Student class has a sort order due to its implementation of Comparer : ");
		  list.forEach(student -> System.out.println(student.getName()));
		  
		  System.out.println();		  
		  System.out.println("Students sorted by age using AgeComparator's sort order : ");
		  Collections.sort(list, new AgeComparator() );
		  list.forEach(student -> System.out.println(student.getName()));
		  
		  
		  

		  
		  

	}

}
