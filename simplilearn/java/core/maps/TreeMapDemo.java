package simplilearn.java.core.maps;

import java.util.TreeMap;

public class TreeMapDemo
{
	public static void treeMapMain()
	{
		TreeMap<Integer, String> treeMap = new TreeMap<>();
		
		treeMap.put(3, "A");
		treeMap.put(2, "B");
		treeMap.put(1, "C");
		
		// REMEMBER - SORTS KEYS  - NOT VALUES!!
		System.out.println(treeMap);
		
		
	}
}
