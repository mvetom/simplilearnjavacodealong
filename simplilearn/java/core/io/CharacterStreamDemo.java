package simplilearn.java.core.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamDemo
{

	public static void charDemoMain()
	{
		FileReader readerStream = null;
		FileWriter writerStream = null;
		
		try
		{
			readerStream = new FileReader("C:\\Study\\Java\\SimpliLearn\\source.txt");
			writerStream = new FileWriter("C:\\Study\\Java\\SimpliLearn\\dest.txt");
			// Reading source file and writing content to target file character by character.

			int content;
			
			while((content = readerStream.read())!= -1)
			{
				writerStream.append((char)content);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if(readerStream != null)
				{
					readerStream.close();
				}
				if(writerStream != null)
				{
					writerStream.close();
				}
			}
			catch(IOException ie)
			{
				ie.printStackTrace();
			}
		}
		
	}

}
