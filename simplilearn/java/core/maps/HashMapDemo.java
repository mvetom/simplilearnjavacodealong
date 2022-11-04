package simplilearn.java.core.maps;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;

public class HashMapDemo
{
	public static void hashMapMain()
	{
		
		// Key String,  Value Integer
		Map<String, Integer> map = new HashMap<>();
		
		map.put("a", 10);
		map.put("b", 20);
		map.put("c", 30);
		
		System.out.println("Size of map is: " + map.size());
		System.out.println(map);
		
		if(map.containsKey("a"))
		{
			Integer a = map.get("a");
			System.out.println("value for key" + " \"a\" is " + a);	
		}
		
		
		for(String key : map.keySet())
		{
			System.out.println("Key: " + key + " Value: " + map.get(key));
		}
		
        for(Entry<String, Integer> entry : map.entrySet())
        {
        	System.out.println("key: " + entry.getKey() + " value: " + entry.getValue() );
        }
		
	}
}
