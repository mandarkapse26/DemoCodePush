package javaNew8;

import java.util.Arrays;
import java.util.List;

public class UpperLower {

	public static void main(String[] args) {
   List<String> name = Arrays.asList("Mt","mn","Mk","vk","ak","ap","SK");
   
   name.stream().map(String::toUpperCase)
   .forEach(System.out::println);
   
   name.stream().map(String::toLowerCase)
   .forEach(System.out::println);
	}

}
