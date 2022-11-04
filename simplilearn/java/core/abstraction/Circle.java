package simplilearn.java.core.abstraction;

public class Circle extends GraphicObject
{

// Guess what will happen if I uncomment?	
//	Circle()
//	{
//		System.out.println("Hello! I'm the Circle child");
//	}
	
	@Override
	void draw()
	{
		System.out.println("Drawing a Circle");

	}
	
	void myVeryCircularMethod()
	{
		System.out.println("I'm very specific to the circle class!");
	}

	@Override
	void resize()
	{
		System.out.println("Resizing a Circle");

	}

}
