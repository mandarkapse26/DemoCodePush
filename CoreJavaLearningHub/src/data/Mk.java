package data;

import java.util.Scanner;

public class Mk {
	public static void main(String[] args) {
//		String name ="Mandar";
//		int age =24;
//		double salary =500000.00;
//		float height = 5.5f;
//		char a = 'M';
//		boolean m =true ;
//		System.out.println(name+"\n"
//		+age+"\n"
//				+salary+"\n"+a+"\n"+height+"\n"+m);
		
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter you fullnmae :");
//		String fullname = sc.nextLine();
//		System.out.println(fullname);
		
//		// for
//		for(int m = 1; m <= 100; m = m+1){
//			System.out.println(m);
		
//		}
		
//		int a =100;
//		while(a >= 1) {
//			System.out.println(a);
//			a = a-1;
//		}
		
//		int s = 100;
//		do {
//			System.out.println(s);
//			s = s-1;
//		}while(s >= 1);
//		
		//
		
		        Scanner sc = new Scanner(System.in);

		        // Taking two numbers as input
		        System.out.print("Enter first number: ");
		        double num1 = sc.nextDouble();

		        System.out.print("Enter second number: ");
		        double num2 = sc.nextDouble();

		        // Taking operator as input
		        System.out.print("Enter operator (+, -, *, /, %): ");
		        char operator = sc.next().charAt(0);

		        double result;

		        // Using switch to perform operation
		        switch (operator) {
		            case '+':
		                result = num1 + num2;
		                System.out.println("Result = " + result);
		                break;

		            case '-':
		                result = num1 - num2;
		                System.out.println("Result = " + result);
		                break;

		            case '*':
		                result = num1 * num2;
		                System.out.println("Result = " + result);
		                break;

		            case '/':
		                if (num2 != 0) {
		                    result = num1 / num2;
		                    System.out.println("Result = " + result);
		                } else {
		                    System.out.println("Error: Division by zero!");
		                }
		                break;

		            case '%':
		                result = num1 % num2;
		                System.out.println("Result = " + result);
		                break;

		            default:
		                System.out.println("Invalid operator!");
		                
		         
		        }  
		      
		
		}
		
	}

