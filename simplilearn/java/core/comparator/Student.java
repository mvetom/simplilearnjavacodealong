package simplilearn.java.core.comparator;

class Student implements Comparable<Student>
{
	
	private String name;
	private int rollNumber;
	private int age;
	
	Student( int rollNumber, String name,  int age)
	{
		this.name = name;
		this.rollNumber = rollNumber;
		this.age = age;
    }
	

	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	
	public String getName()
	{
		return this.name;
	}
	
	public int getRollNumber()
	{
		return this.rollNumber;
	}
	
    public int getAge()
    {
    	return this.age;
    }
    
    @Override
    public String toString()
    {
    	return ("Student Name: " + getName()  + 
    	"\nStudent Roll Number: " +  getRollNumber() +
    	"\nStudent Age: " + getAge());
    
    }
    
    @Override
    public boolean equals(Object obj)
    {
    	
    	// first two ifs are "sanity checks"
    	if(this == obj) // I assume this means equal reference
    	{
    		return true;  
    	}
    	
    	if(obj == null || obj.getClass() != this.getClass())
    	{
    		return false;
    	}
    	
    	Student student = (Student) obj;
    	
    	return(student.rollNumber == this.rollNumber);
    }
    
    @Override
    public int hashCode()
    {
    	return this.rollNumber;
    }


	@Override
	public int compareTo(Student student)
	{
		return this.rollNumber - student.rollNumber;
	}
}
