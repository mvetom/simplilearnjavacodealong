package simplilearn.java.core.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo
{

	public static void byteDemoMain()
	{
	    FileInputStream inStream = null;
	    FileOutputStream outStream = null;
	    
	    try 
	    {
	    	inStream = new FileInputStream("C:\\Study\\Java\\SimpliLearn\\source.txt");
	    	outStream = new FileOutputStream("C:\\Study\\Java\\SimpliLearn\\dest.txt");
	    	
	    	// reads a byte at a time, if it reached end of the file, returns -1
	    	int content;
	    	while ((content = inStream.read()) != -1)
	    	{
	    		outStream.write((byte) content);
	    	}
	    } catch (IOException e)
		{
			e.printStackTrace();
		} finally
	    {
			try 
			{
	    		if(inStream != null)
	    		{
	    		
						inStream.close();

	    		}
	    		if(outStream != null)
	    		{
	    			outStream.close();
	    		}
			}
			catch (IOException e)
			{
					e.printStackTrace();
			}
	    }
	    
	}

}
