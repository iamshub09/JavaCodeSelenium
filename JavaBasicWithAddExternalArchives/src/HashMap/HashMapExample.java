package HashMap;
import java.util.*;
import java.util.HashMap;


public class HashMapExample {

	public static void main(String[] args) {
		// Creating obj 
		HashMap<Integer, String> obj = new HashMap<>();
		HashMap<Integer, Integer> obj2 = new HashMap<Integer, Integer>();
		
		// Enter values as key and value 
		obj.put(1, "shubham");
		obj.put(null, "sonu");
		obj.put(null, "tanda");
		System.out.println(obj);
		obj.put(1, "sonia");
		obj.put(5, null);
		obj.put(6, null);
		obj.put(7, "kaku");
		obj.put(8, "naina");
		System.out.println(obj);
		
		// methods 
		obj.putIfAbsent(1, "shubham");
		System.out.println(obj);
		
		//obj.clear();
		System.out.println(obj.isEmpty());
		System.out.println(obj.containsKey(1)); // true 
		System.out.println(obj.containsValue("tanda")); // true
		System.out.println(obj.keySet()); // return all keys 
		obj.remove(7);
		System.out.println(obj);
		obj.replace(8, "tommy");
		System.out.println(obj);
		System.out.println(" ");
		// print each value 
		
		for(java.util.Map.Entry<Integer, String> a: obj.entrySet())
		{
			System.out.println("key is "+ a.getKey()+ " " +"value is " + a.getValue());
		
		}
		
		
		
		
		
		
		
		
	}

}
