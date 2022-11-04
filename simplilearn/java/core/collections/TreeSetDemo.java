package simplilearn.java.core.collections;

import java.util.TreeSet;

public class TreeSetDemo
{

	public static void treeSetMain()
	{
		TreeSet<String> treeSet = new TreeSet<>();
		
		treeSet.add("B");
		treeSet.add("A");
		treeSet.add("C");
		treeSet.add("C");
		System.out.println(treeSet);
	}
	
}
