package CollectionDemo;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet<Integer> obj1 = new HashSet<Integer>();
		obj1.add(10);
		obj1.add(20);
		obj1.add(300);
		obj1.add(400);
		obj1.add(500);
		obj1.add(600);
		obj1.add(700);
		obj1.add(700);
		System.out.println("In Hashset it prints random values and do not accept duplicate value and indexs are not maintain "+obj1);

	}

}