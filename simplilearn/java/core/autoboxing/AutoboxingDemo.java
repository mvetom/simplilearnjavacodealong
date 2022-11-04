package simplilearn.java.core.autoboxing;

public class AutoboxingDemo
{
	public static void autoboxingMain()
	{
		int i = 10;
		
		//Autobox
		
		Integer iObj = Integer.valueOf(i);
		System.out.println("Value of Integer obj: " + iObj);
		
		//?? I thought AUTOboxing would be more like this?
		iObj = 15;
		
		System.out.println("Value of Integer obj: " + iObj);
		
		// Does this work too?
		i = 14;
		iObj = i;
		
		System.out.println("Value of Integer obj: " + iObj);
		//unboxing
		int i1 = iObj;
		
		System.out.println("Value of i1: " + i1);
		
		// Now look at characters
		
		//Autobox
		Character charObj = 'a';
		System.out.println("Value of Character charObj: " + charObj);
		
		char ch = charObj;
		System.out.println("Value of char ch: " + ch);

		
	}
}
