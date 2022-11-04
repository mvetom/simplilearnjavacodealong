package simplilearn.java.core.method_calling;
import simplilearn.java.core.method_calling.Student;

public class MethodCallingDemo
{

	public static void methodCallingMain()
	{
		int i = 1;
		changeValue(i);  // no effect.  Pass by value
		System.out.println("i is: " + i);
		int result =  getNewValue(i);  // this will give you want you want,
		//... but it will not change i itself;
		System.out.println("Result is: " + result);
		System.out.println("i is: " + i);
		
		Student john = new Student("John", 25, "23 East Street");
		System.out.println(john.getName());
		System.out.println(john.getAge());
		System.out.println(john.getAddress());
		
		// why does this work?  B/c we are sending a copy 
		// of the value of john... BUT THAT VALUE IS A REFERENCE
		// so when the method receives it,  it is using a reference
		// to the same object.
		changeNameInSameObject(john);
		System.out.println();
		System.out.println(john.getName());
		System.out.println();
		john.setName("John Again");
		
		Student jane = changeNameInDiffObject(john);
		System.out.println(john.getName());
		System.out.println(john.getAge());
		System.out.println(john.getAddress());
		System.out.println();
		System.out.println(jane.getName());
		System.out.println(jane.getAge());
		System.out.println(jane.getAddress());
         
	}
	
	private static int getNewValue(int i)
	{
		i = i + 1;
		return i;
				
	}
	private static void changeValue(int i)
	{
		i = i + 1;
	}
	
	//  dangerous and considered bad practice
	static void changeNameInSameObject(Student student)
	{
		student.setName("Jane");
	}
	
	static Student changeNameInDiffObject(Student student)
	{
		Student newStudent = new Student("Jane", student.getAge(), student.getAddress());
	    return newStudent;
	}
	

}
