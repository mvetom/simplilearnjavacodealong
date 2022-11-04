package simplilearn.java.core.equalsandhashcode;

public class Student
{
	
	String name;
	int rollNumber;
	String address;
	
	public Student(String name,  int age, String address)
	{
		this.name = name;
		this.rollNumber = age;
		this.address = address;
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
	
	public int getRollNumber()
	{
		return this.rollNumber;
	}
	
    public String getAddress()
    {
    	return this.address;
    }
    
    @Override
    public String toString()
    {
    	return ("Student Name: " + getName()  + 
    	"\nStudent Age: " +  getRollNumber() +
    	"\nStudent Address: " + getAddress());
    
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
}
