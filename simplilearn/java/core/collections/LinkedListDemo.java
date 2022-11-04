package simplilearn.java.core.collections;
import java.util.*;
public class LinkedListDemo
{

	public static void linkedListMain()
	{
	     
	   //  We'll use the ACTUAL Class name in the initialization this time.
	   // Reason being:  We want to use methods that are only available to
	  // the LinkedList class itself,  not just the generic interface methods
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("A");
		list.add("B");
		//System.out.println(list);
		
        list.addLast("C");
       // System.out.println(list);
        
        list.addFirst("a");
        //System.out.println(list);
        
        list.add(3, "c");
        System.out.println(list);
        
        LinkedList myRemovedElements = new LinkedList<String>();
        
        myRemovedElements.add(list.remove("B"));
        System.out.println(list);
        
        myRemovedElements.add(list.remove(3));
        System.out.println(list);
        
        myRemovedElements.add(list.removeFirst());
        System.out.println(list);
        
        myRemovedElements.add(list.removeLast());
        System.out.println(list);
        
        System.out.println();
        
        
        System.out.println("removed elements:");
        System.out.println(myRemovedElements);
        
        
        
        
        
        
        
	}

}
