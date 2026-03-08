package javaNew8;

import java.util.Arrays;
import java.util.List;

public class firstname {

	public static void main(String[] args) {
	
		List<String> names = Arrays.asList("Mandar1", "Aditya", "Ankit", "Vishal","Mandar2","Mandar3");
		
		names.stream().filter(e-> e.contains("M")).forEach(System.out::println);
		

	}

}
