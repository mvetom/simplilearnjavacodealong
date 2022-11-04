package simplilearn.java.core.nested;

public class NestedDemo
{
	public static void nestedDemoMain()
	{
		// create an instance of a Static Nested Class, and call its method
		OuterClass.StaticNestedClass nestedObject  = new OuterClass.StaticNestedClass();
	    
		nestedObject.display();
		
		// have the Outer Class call the method of a private static class FOR YOU
		OuterClass.displayTheSecret();
		
		OuterClass.InnerClass in = new OuterClass().new InnerClass();
		in.display();
		
		System.out.println();
		System.out.println();
		
		OuterClass oc = new OuterClass();
		oc.outerClassMethod(); // this method has a class inside it!!
	
	    
	}
	
}
