 package Java8;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class valuesorting {

	public static void main(String[] args) {
//List<Integer> obj = Arrays.asList(30,34,87,12,45,89,79,56,89);
	
//	obj.forEach( s -> {if(s > 40)
//			             System.out.println(s); } );
//	
	
//	obj.stream().filter(s-> s>30).map(s-> s*4)
//	.forEach(System.out::println);
		

	
	String [] obj1 = {"sonu","vishal","jagu","Ajay","sonu","vishal","vishal"};
	
	HashMap<String,Integer> obj3 = new HashMap<String,Integer>();
	for(String name:obj1) {
		obj3.put(name,obj3.getOrDefault(name, 0)+1);
		}
	System.out.println(obj3);
	
	
	}
}


