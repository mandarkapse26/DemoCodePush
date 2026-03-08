package javaNew8;

interface MyInterface {
    int show(int a, int b);   // return type int
}

public class FunctionalInterfaces {
    public static void main(String[] args) {

        MyInterface obj = (a, b) -> a + b;

        int result = obj.show(5, 3);
        System.out.println(result);
    }
}
