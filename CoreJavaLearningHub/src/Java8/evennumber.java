package Java8;

import java.util.Arrays;
import java.util.List;

public class evennumber {

	public static void main(String[] args) {
		
		List <Integer> number = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		//number.stream().filter(n->n%2==0).forEach(System.out::println);
		
		 // Even Numbers
        System.out.println("Even Numbers:");
        number.stream()
              .filter(n -> n % 2 == 0)
              .forEach(System.out::println);

        // Odd Numbers
        System.out.println("Odd Numbers:");
        number.stream()
              .filter(n -> n % 2 != 0)
              .forEach(System.out::println);
    

	}

}
