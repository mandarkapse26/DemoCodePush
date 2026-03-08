package task01;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Hashmap {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<>(); 
		map.put(1, "vishal");
		map.put(2, "jagu");
		map.put(3, "amol");
		map.put(4, "ajay");
		map.put(5, "shubham");
		map.entrySet();
		System.out.println(map);
		
		 LinkedHashMap map1 = new LinkedHashMap<>();
		 map1.putAll(map);
		 map1.put(7, "nt");
		 map1.put(8, "rr");
		 map1.put(9, "bb");
		 System.out.println(map1);
	}

}
