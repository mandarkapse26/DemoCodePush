package javaNew8;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

import task01.Hashmap;

public class sortedmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> obj = new HashMap<>();
		obj.put(4, "mandar");
		obj.put(3, "ankit");
		obj.put(2, "vishal");
		obj.put(1, "aditya");
		
		obj.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByKey())
		.forEach(s->System.out.println(s.getKey()+"="+s.getValue()));
		
		obj.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
		.forEach(s->System.out.println(s.getKey()+"="+s.getValue()));
	
	}

}
