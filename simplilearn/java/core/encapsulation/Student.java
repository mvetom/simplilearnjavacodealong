package simplilearn.java.core.encapsulation;

public class Student
{
	
	private String name;
	private int age;
	private String address;
	private String testGetSetters;
	
	public Student(String name,  int age, String address)
	{
		this.name = name;
		this.age = age;
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
