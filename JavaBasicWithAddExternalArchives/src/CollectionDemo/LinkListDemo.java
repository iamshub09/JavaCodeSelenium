package CollectionDemo;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkListDemo {

	public static void main(String[] args) {
		
		// create linked list 
		LinkedList<String> obj1 = new LinkedList<String>();
		obj1.add("Orange");
		obj1.add("Red");
		obj1.add("Green");
		obj1.add("Blue");
		System.out.println(obj1);
		
		// Add first and last values 
		obj1.addFirst("First");
		obj1.addLast("Last");
		System.out.println("check by adding first and last methods: " + obj1);
	
		// Remove First value 
		obj1.removeFirst();
		System.out.println("check by remove first value: " + obj1);
		
		// 
		System.out.println(obj1.get(1));
		obj1.remove(1);
		System.out.println(obj1);
	}

}