package simplilearn.java.core.method_calling;

class Student
{
	String name;
	int age;
	String address;
	
	Student(String name,  int age, String address)
	{
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
    void setName(String name)
	{
		this.name = name;
	}
	
    void setAge(String name)
	{
		this.name = name;
	}
	
    void setAddress(String address)
	{
		this.address = address;
	}
	
    String getName()
    {
    	int i = 2;
    	
    	// You could change this code to set 
    	// String returnVar = a value
    	// and then return returnVar as the final statement
    	// But it is better to return within the branch
    	if(i== 1)
    	{
    		return "test";
    	}
    	else
    	{
    		return name;
    	}
    }
    
    int getAge()
    {
    	return age;
    }
	
    String getAddress()
    {
    	return address;
    }
}
