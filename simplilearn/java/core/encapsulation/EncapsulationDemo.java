package simplilearn.java.core.encapsulation;

public class EncapsulationDemo
{

	public static void encapsulationDemoMain()
	{
		Student student = new Student("Bobcat", 3 , "wilderness");
		// uncomment, this fails, because age is private
		//student.age = 12;
		// getters and setters are callable however....
	}

}
