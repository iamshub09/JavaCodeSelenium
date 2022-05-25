package CollectionDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		
		
		// create array list 
		ArrayList<Integer> AL1 = new ArrayList<Integer>();
		ArrayList<Integer> AL2 = new ArrayList<>(); // this is also fine 
		ArrayList<String> AL3 = new ArrayList<String>();
		
		
		// Add values in array list 
		AL1.add(10);
		AL1.add(20);
		AL1.add(30);
		System.out.println("get All value from array list : "+ AL1);
		
		// print single values of array list 
		System.out.println("get single value from array list : "+ AL1.get(1));
		
		// Update Array list value 
		AL1.set(0, 5);
		System.out.println("get All value from array list after update : "+ AL1);
		
		// Remove index and its value from array list 
		AL1.remove(2);
		System.out.println("get All value from array list after remove index 2 : "+ AL1);
		
		//Add value in array list in the specific index 
		AL1.add(1, 15);
		System.out.println("get NEW value from array list in the specific index : "+ AL1);
		
		// New Array
		AL2.add(25);
		AL2.add(35);
		AL2.add(30);
		System.out.println("Print New Array list of elements: "+ AL2);
		
		//Merge one arraylist in to another array list 
		AL1.addAll(AL2);
		System.out.println("Print complete Array list after merge another aaray: "+ AL1);
		
		//Print all element using for loop
		System.out.println("    " );
		System.out.println("Print all element using for loop");
		
		for(int i=0; i < AL1.size(); i++)
		{
			System.out.println( AL1.get(i));
		}
	
		System.out.println("    " );
		System.out.println("print element using for each loop");
		
		for( Integer a : AL1) 
		{
			System.out.println(a);
		}
		
		// Other Methods 
		// Check weather list is empty or not
		System.out.println("Is my list is empty : "+ AL1.isEmpty());
		
		// to clear array list 
		System.out.println("We need to clear this array list "+ AL2);
		AL2.clear();
		System.out.println("Array should be cleared " + AL2);
		
		// CHECK WEATHER this values contains in my array list 
		System.out.println("CHECK WEATHER 5 values present in my array list : "+AL1.contains(5));
		
		
		// Check index of any value 
		System.out.println("Index value of 5 is : "+ AL1.indexOf(5));
		
		// check the size of an array list
		System.out.println("check the size of an array list : "+ AL1.size());
		
		// Sort your list using collection class
		Collections.sort(AL1);
		System.out.println(AL1);
		
		// RANDOM 
		System.out.println(AL1);
		System.out.println(AL1.get(1));
		AL1.remove(1);
		System.out.println(AL1.get(1));
		
	}
}