package Stream;

import java.util.*;
import java.util.stream.*;

public class Task {

    public static void main(String[] args) {

        // 1️ Filter Even Numbers
        List<Integer> nums1 = Arrays.asList(5,4,2,25,10, 15, 20);
        nums1.stream()
             .filter(n -> n % 2 == 0)
             .forEach(System.out::println);

        // 2️ Filter Strings by Length
        List<String> names = Arrays.asList("Ram", "Amit", "John", "Al");
        names.stream()
             .filter(name -> name.length() > 3)
             .forEach(System.out::println);

        // 3️ Filter Names Starting with A
        names.stream()
             .filter(n -> n.startsWith("A"))
             .forEach(System.out::println);

        // 4️ Filter Objects (Employee)
        class Employee {
            String name;
            int salary;

            Employee(String name, int salary) {
                this.name = name;
                this.salary = salary;
            }
        }

        List<Employee> list = Arrays.asList(
                new Employee("Ram", 20000),
                new Employee("Amit", 50000)
        );

        list.stream()
            .filter(emp -> emp.salary > 30000)
            .forEach(emp -> System.out.println(emp.name));

        // 5️ Remove Null Values
        List<String> data = Arrays.asList("Java", null, "Selenium");
        data.stream()
            .filter(Objects::nonNull)
            .forEach(System.out::println);

        // 6️ Filter + Map
        List<Integer> nums2 = Arrays.asList(5, 10, 15, 20);
        nums2.stream()
             .filter(n -> n > 10)
             .map(n -> n * 2)
             .forEach(System.out::println);

        // 7️ Distinct + Filter
        List<Integer> nums3 = Arrays.asList(10, 20, 20, 30);
        nums3.stream()
             .distinct()
             .filter(n -> n > 15)
             .forEach(System.out::println);

        // 8️ Multiple Filters
        nums1.stream()
             .filter(n -> n > 5)
             .filter(n -> n < 20)
             .forEach(System.out::println);
    }
}
