package simplilearn.java.core.nested;

class OuterClass
{
	static int outerStaticMember = 10;
	int instanceMember = 20;
	
	private static int outerPrivateMember = 30;
	
	void outerClassMethod()
	{
		System.out.println("In The Outer Class Method");
		
		// LOOK!! WE JUST PUT A CLASS INSIDE OF A METHOD!!!
		class MethodLocalClass
		{
			
			void localInnerMethod()
			{
				System.out.println("In the method local class Method");
			}
		}
		
		MethodLocalClass mlc = new MethodLocalClass();
		mlc.localInnerMethod();
	}
	
	
    // NON-Static Nested Class
	class InnerClass
	{
		public void display()
		{
			System.out.println();
			System.out.println("This is an inner class method");
			System.out.println();
			System.out.println();
			
			System.out.println("This is an OC instance member: " + instanceMember );
			
			System.out.println("This is an Outer Class Static Member: " + outerStaticMember);
			
			System.out.println("This is an OC PRIVATE STATIC member:  "  + outerPrivateMember );
			

			
		}
	}
	static class StaticNestedClass 
	{
		void display()
		{
			System.out.println("Static member of outer class ="
		+ outerStaticMember);
			
	        System.out.println("private static member of outer class = "
	        		+ outerPrivateMember);
	        // doesn't compile!!
	        //System.out.println("Non static member of outer class" + instanceMember);
		}
	}

	private static class SuperSecretStaticClass
	{
		static void display()
		{
			System.out.println("Here is nested class secret!");
		}
	}
	
	public static void displayTheSecret()
	{
		SuperSecretStaticClass.display();
	}
}

