package simplilearn.java.core.equalsandhashcode;

public class EqualsAndHashCodeDemo
{

	public static void equalsAndHashCodeDemoMain()
	{
		
		Student john = new Student( "John", 12,  "23 East, California");
		Student joe = new Student( "Joe", 14,  "23 West, California");
		Student joanna = new Student( "Joanna", 13,  "23 North, California");
	    Student john2 = new Student( "John", 12,  "23 East, California");
	
	    System.out.println(john.equals(john2));
	}

}
