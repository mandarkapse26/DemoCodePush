package javaNew8;

import java.util.Arrays;
import java.util.List;

public class sorting {

	public static void main(String[] args) {
		
		List<Integer> num = Arrays.asList(1,7,8,9,10,5,2,3);
		num.sort((a,b)-> a-b);
		System.out.println(num);

	}

}
