package simplilearn.java.core.enumeration;

public class EnumDemo
{

	public static void enumDemoMain()
	{
	
		Color c1 = Color.RED;
		
		System.out.println("Red Enum name: " + c1.name());
		System.out.println("Red Enum value: " + c1.getValue());
		
		for(Color color : Color.values())
		{
			System.out.println("Enum value:" + color.getValue());
		}
		
		for(Color color : Color.values())
		{
			System.out.println("Enum name:" + color.name());
		}

	}

}
