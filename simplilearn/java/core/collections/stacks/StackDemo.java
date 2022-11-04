package simplilearn.java.core.collections.stacks;

import java.util.Stack;

public class StackDemo
{
	public static void stackDemoMain()
	{
		
		Stack<String> stack = new Stack<String>();
		
		stack.push("America");
		stack.push("Germany");
		stack.push("India");
		stack.push("China");
		stack.push("Zimbabwe");
		
		System.out.println("Stack: " + stack);
		
		String poppedElement = stack.pop();
		System.out.println("Took Out: " + poppedElement);
		
		System.out.println("Stack: " + stack);
		
		System.out.println("Top element is: " + stack.peek());
		
		// peek didn't remove the top
		System.out.println("Stack: " + stack);
	}

}
