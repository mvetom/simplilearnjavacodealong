package simplilearn.java.core.collections.queues;

import java.util.PriorityQueue;
import java.util.*;


public class QueueDemo
{

	public static void queueDemoMain()
	{
		
		Queue<String> priQueue = new PriorityQueue<String>();
		
		priQueue.add("India");
		priQueue.add("Germany");
		priQueue.add("America");
		priQueue.add("China");
	    priQueue.add("Zimbabwe");
	    
	    //Could possibly be out of order - because preQueue's To String method is being
	    // called by println.   This is actually Calling Abstract Collections ToString method - which 
	    // does NOT know how to handle order.  
	    System.out.println("original queue: " + priQueue);
	    
	    // NOW remove DOES know that the proper order is "America, China, Germany, India and Zimbabwe"
	    System.out.println(priQueue.remove());
	    
	    // Again, this will not know the right order
	    System.out.println("Remove First Item from queue: " + priQueue);
		
		System.out.println("head of queue: " + priQueue.peek()); 
		
		System.out.println("Poll: Does your queue have a head? What is it?: " +  priQueue.poll());
		
		 System.out.println("What's left in the queue: " + priQueue);
		
		
		// Repeat last two statements several times to demonstrate poll behavior on a blank
		// queue
		//... this should work without error
		 
		 System.out.println("Poll: Does your queue have a head? What is it?: " +  priQueue.poll());
			
		 System.out.println("What's left in the queue: " + priQueue);
		
		 
		 System.out.println("Poll: Does your queue have a head? What is it?: " +  priQueue.poll());
			
		 System.out.println("What's left in the queue: " + priQueue);
		 
		 
		 System.out.println("Poll: Does your queue have a head? What is it?: " +  priQueue.poll());
			
		 System.out.println("What's left in the queue: " + priQueue);
		
		 
		 System.out.println("Poll: Does your queue have a head? What is it?: " +  priQueue.poll());
			
		 System.out.println("What's left in the queue: " + priQueue);
		
		 System.out.println("Poll: Does your queue have a head? What is it?: " +  priQueue.poll());
			
		 System.out.println("What's left in the queue: " + priQueue);
		
		 System.out.println("Poll: Does your queue have a head? What is it?: " +  priQueue.poll());
			
		 System.out.println("What's left in the queue: " + priQueue);
		
		 //  See? no errors above. Now...
		 
		 System.out.println("Now that I've poll() -ed an empty queue many times,  let me try to remove() from an empy queue even ONE time :");
		 
		 // ERROR!!	
		 System.out.println(priQueue.remove());
		
			
	
		
		
		
		
		
	}

}
