package Java8;

import java.util.Arrays;
import java.util.List;

public class starwithLetter {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("ram","rani","shayam","Amit");
		names.stream().filter(name->name.startsWith("r")).forEach(System.out::println);

	}

}
