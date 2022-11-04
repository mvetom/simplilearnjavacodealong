package simplilearn.java.core.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo
{

	public static void serialMain()
	{
		Student student = new Student("John", 25, "23 East, California");
		
		student.setX(10);
		
		String fileName = "C:\\Study\\Java\\SimpliLearn\\Test.txt";

		FileOutputStream fileOut = null;
		ObjectOutputStream objOut = null;
		
		// When Java wants to write an object to a file
		// It serializes the object -that's the only way
		// it can write it!
		// Serialization
		try 
		{
			fileOut = new FileOutputStream(fileName);
			objOut = new ObjectOutputStream(fileOut);
			objOut.writeObject(student);
			
			objOut.close();
			fileOut.close();
			
			System.out.println("Object has been serialized: \n" + student);
		    System.out.println("what is x in original object? " + student.getX());
		} 
		catch (IOException ex)
		{
			System.out.println("IOException is caught");
		}
		
		//Deserialization
		FileInputStream fileIn = null;
		ObjectInputStream objIn = null;
		
		try
		{
			fileIn = new FileInputStream(fileName);
			objIn = new ObjectInputStream(fileIn);
			
			Student object = (Student) objIn.readObject();
			
			System.out.println("Object has been deserialized \n" + object);
			System.out.println("what is x after deserialization? " + object.getX());
			objIn.close();
			fileIn.close();
		}
		catch(IOException ex)
		{
			System.out.println("IOException is caught");
		}
		catch(ClassNotFoundException ex)
		{
			System.out.println("Class Not found! ");
		}
		

	}

}
