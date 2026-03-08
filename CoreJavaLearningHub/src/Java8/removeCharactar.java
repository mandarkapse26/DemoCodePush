package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class removeCharactar {

	public static void main(String[] args) {
		List<String> data = Arrays.asList("Java", null, "Selenium", null,"mysql");

		data.stream()
		    .filter(Objects::nonNull)
		    .forEach(System.out::println);


	}

}
