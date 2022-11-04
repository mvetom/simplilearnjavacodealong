package simplilearn.java.core.statickeyword;

public class Student
{
	static
	{
		System.out.println("I'm the static block!");
		startDate = "August 18"; // this works... even though I declare startDate later!
		// but THIS gives a compile error! Must wait for declaration!
		//System.out.println("The students will start school on: " + startDate);  
		System.out.println("The Student Count is: " + getStudentCount());
		
        // for some reason declaring static variables 
		// in this block,  makes them invisible to the rest 
		// of this class
		// Going to have to figure out if that was always the case...
	}
	
	String name;
	int age;
	String address;
	// This wastes memory.  We create one of these for every student,  and it never changes
	//String college = "NCSU";
	//better.  Use it as static
	static String college = "NCSU";
	static String startDate;
	static int count = 0;
	
	//  Or... I can have a static BLOCK
	// see above
	
	
	public Student(String name,  int age, String address)
	{
		this.name = name;
		this.age = age;
		this.address = address;
		System.out.println("The students will start school on: " + startDate);
    }
	static int getStudentCount()
	{
	   return Student.count;	
	}
	
	static void studentCount()
	{
		Student.count =  count + 1;
	}
	
	public Student()
	{
		// TODO Auto-generated constructor stub
	}

	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setAddress(String address)
	{
		this.address = address;
	}
	
	
	public String getName()
	{
		return this.name;
	}
	
	public int getAge()
	{
		return this.age;
	}
	
    public String getAddress()
    {
    	return this.address;
    }
    
    @Override
    public String toString()
    {
    	return ("Student Name: " + getName()  + 
    	"\nStudent Age: " +  getAge() +
    	"\nStudent Address: " + getAddress());
    
    }
}
