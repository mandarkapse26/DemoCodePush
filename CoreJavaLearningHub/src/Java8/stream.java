package Java8;

import java.util.Arrays;
import java.util.List;

public class stream {

	public static void main(String[] args) {
//		 List<Integer> numbers = Arrays.asList(5, 12, 7, 18, 3);
//
//	        numbers.stream()
//	               .filter(n -> n > 10)   // condition
//	               .forEach(System.out::println);
	   
	        class Employee {
	            String name;
	            int salary;
	            int age;

	            Employee(String name, int salary,int age) {
	                this.name = name;
	                this.salary = salary;
	                this.age = age;
	                
	            }
	        }

	        List<Employee> list = Arrays.asList(
	                new Employee("Rahul", 20000,21),
	                new Employee("Amit", 50000,29),
	                new Employee("Neha", 30000,30)
	                
	        );

	        list.stream()
	            .filter(emp -> emp.salary >= 30000 && emp.age >=28)
	            .forEach(emp -> System.out.println(emp.name));

	}

}
