package array;

import java.util.Scanner;

public class trycatch {

	 public static void checkAge(int age) {
	        if (age < 18) {
	            // Explicitly throwing an ArithmeticException
	            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
	        } else {
	            System.out.println("Access granted - You are old enough!");
	        }
	    }
	
	public static void main(String [] args) throws ArithmeticException  {
		
//		
//		try {
//			Scanner sc = new Scanner(System.in);
//			System.out.println("Enter first value :");
//			double numb = sc.nextInt();
//			System.out.println("Enter second value :");
//			double numb1 = sc.nextInt();
//		//	System.exit(0);
//			double result = numb/numb1; 
//			System.out.println(result);
//		}
//		catch (Exception e ){
//		//	System.out.println("something went wrong");
//			e.printStackTrace();		
//		}	
//		finally {
//				System.out.println("i am mandar");
//			}

		        checkAge(15); // This will throw an exception
		    }
	}

