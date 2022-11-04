package simplilearn.java.core.abstraction;

public class AbstractionDemo
{

	public static void abstractionDemoMain()
	{
		
		System.out.println("Graphic Object which is a Circle under the Covers:");
		GraphicObject circle = new Circle();
		circle.moveTo(3, 4);
		circle.draw();
		circle.resize();
		// you can't do this! You declared it as a GraphicObject!
		//circle.myVeryCircularMethod();
		
		System.out.println();
		System.out.println("Plain old Circle as Circle:");
		System.out.println();
		
		Circle totallyCircle = new Circle();
		totallyCircle.moveTo(3, 4);
		totallyCircle.draw();
		totallyCircle.resize();
		// you CAN do this! You declared it as a CIRCLE!
		totallyCircle.myVeryCircularMethod();
		
		System.out.println();
		System.out.println("Rectangle as A Graphic Object:");
		System.out.println();
		
		GraphicObject rectangle = new Rectangle();
		rectangle.moveTo(5, 15);
		rectangle.draw();
		rectangle.resize();
		
	}

}
