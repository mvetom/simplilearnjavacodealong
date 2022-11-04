package simplilearn.java.core.abstraction;

public abstract class GraphicObject
{
	int x, y;
	
	GraphicObject()
	{
		System.out.println("Hello!  I'm the parent abstract class, and my name is GraphicObject!");
	}
	
	void moveTo(int newX, int newY)
	{
		System.out.println("move to x: " + newX + " and y:" + newY);
	}
	
	abstract void draw();
	abstract void resize();
}
