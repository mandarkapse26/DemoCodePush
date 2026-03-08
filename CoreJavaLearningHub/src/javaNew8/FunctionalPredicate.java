package javaNew8;

import java.util.function.Predicate;

public class FunctionalPredicate {

	public static void main(String[] args) {
		 Predicate<Integer> check = x -> x > 10;

	        System.out.println(check.test(20));  // true
	        System.out.println(check.test(10));   // false
	    }
	}