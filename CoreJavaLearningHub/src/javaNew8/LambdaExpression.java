package javaNew8;

import java.util.Arrays;
import java.util.List;
interface Add{
	int sum(int a,int b);
}
public class LambdaExpression {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Mandar", "Aditya", "Ankit", "Vishal");
        names.forEach(name -> System.out.println(name));
        
        Add add = (a,b)->a+b;
        System.out.println(add.sum(8, 8));
    }
}
