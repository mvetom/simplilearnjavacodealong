package simplilearn.java.core.comparable;
import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo
{
  public static void comparableDemoMain()
  {
	  
	  ArrayList<Student> list = new ArrayList<Student>();
	  Student john = new Student("John",  3, "21 East");
	  Student jane = new Student("Jane", 1, "18 South");
	  Student tom = new Student("Tom", 2, "20 South");
	  
	  
	  list.add(john);
	  list.add(jane);
	  list.add(tom);
	  
	  Collections.sort(list);

	  System.out.println("Students after sorting : ");
	  list.forEach(student -> System.out.println(student.getName()));
	  
	  
	  
 
  }
}
