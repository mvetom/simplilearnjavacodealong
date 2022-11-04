package simplilearn.java.core.abstraction;

public class Rectangle extends GraphicObject
{

	@Override
	void draw()
	{
		System.out.println("Drawing a Rectangle");

	}

	@Override
	void resize()
	{
		System.out.println("Resizing a Rectangle");

	}
	
	Rectangle()
	{
		System.out.println("Hello! I'm the Rectangle child");
	}

}
