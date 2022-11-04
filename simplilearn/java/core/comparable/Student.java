package simplilearn.java.core.comparable;

class Student implements Comparable<Student>
{
	
	private String name;
	private int rollNumber;
	private String address;
	
	Student(String name,  int rollNumber, String address)
	{
		this.name = name;
		this.rollNumber = rollNumber;
		this.address = address;
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


	@Override
	public int compareTo(Student student)
	{
		return this.rollNumber - student.rollNumber;
	}
}
