package Java8;

import java.util.Arrays;
import java.util.List;

public class asendingDescending {

	public static void main(String[] args) {
	
		List <String> obj = Arrays.asList("a","A","B","b","d","D","E");
		obj.stream().sorted(String.CASE_INSENSITIVE_ORDER).forEach(System.out::println);

	}

}
