package Java8;

import java.util.Arrays;
import java.util.List;

public class lengthFinds {

	public static void main(String[] args) {
		
		List<String>names = Arrays.asList("Mandar","Sonu","Jagu","Ajay","vaishnavi");
		names.stream().filter(n->n.length()>4).forEach(System.out::println);

	}

}
