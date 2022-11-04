package simplilearn.java.core.annotations;

import java.lang.reflect.Method;


public class AnnotationDemo
{
	// hmmn... annotations seem to be a kind of interface...
	// and this providing the method a value... but but...
	// where is the method implemented?
	@MyCustomAnnotation(value = 10)
	public void sayHello()
	{
		System.out.println("My Custom Annotation");
	}
	public static void annotaDemoMain() throws Exception
	{
		AnnotationDemo h = new AnnotationDemo();
		
		Method methodVal = h.getClass().getMethod("sayHello");
		
		MyCustomAnnotation myCustomAnnotation = methodVal.getAnnotation(MyCustomAnnotation.class);
	    System.out.println("value is:" + myCustomAnnotation.value());
	}
}
