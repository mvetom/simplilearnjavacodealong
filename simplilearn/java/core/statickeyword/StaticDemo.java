package simplilearn.java.core.statickeyword;

public class StaticDemo
{

	public static void staticDemoMain()
	{
		Student john = new Student("John", 25, "23 East Street, Los Angeles, Califorina");
		Student jane = new Student("Jane", 25, "23 East Street, Los Angeles, Califorina");
		Student june= new Student("June", 25, "23 East Street, Los Angeles, Califorina");
		Student jake = new Student("Jake", 25, "23 East Street, Los Angeles, Califorina");
		System.out.println(john.getName());
		System.out.println(john.getAge());
		System.out.println(john.getAddress());
		// we shouldn't do things like this....
		System.out.println(john.college);
		// No! This should not happen
		june.college = "AAAHHHHH! I should have made college final! Someone changed everyone's college to Chapel Hill!";
		
		// But it can happen anyway!
		System.out.println(john.college);


	}
	


}
