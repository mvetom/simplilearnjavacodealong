package simplilearn.java.core.exceptions;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionDemo
{
	public static void checkedExMain() throws FileNotFoundException, IOException, MyException
	{
		FileReader file = new FileReader("C:\\test\\a.text");
		BufferedReader fileInput = new BufferedReader(file);
		
		// Print first 3 lines of File "C:\\text\a.txt"
		
		for(int counter = 0; counter < 3; counter ++ )
		{
			System.out.println(fileInput.readLine());
		}
		
		fileInput.close();
		throw new MyException();
	}

	
	
}
