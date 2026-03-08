package array;

import java.util.Scanner;

public class throwtask {
//	public static void checkage(int num) {
//		
//		if(num<20) {
//			throw new ArithmeticException ("Acces denied - you must be 20 or older");
//		}else {
//			System.out.println("access granted you are old");
//		
//		}
//		
//	}
//	public static void main(String [] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter you age :");
//		int num = sc.nextInt();
//		
//		try {
//			checkage(num);	
//		}catch(ArithmeticException e) {
//			System.out.println("exception caught="+e.getMessage());
//		}finally {
//			System.out.println("program ended");
//		}
//		
//		
		
		
		// method declaring that it may throw Exception
	    static void getInput() throws Exception {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();
	        System.out.println("You entered: " + num);
	    }

	    public static void main(String[] args) {
	        try {
	            getInput();   // method call
	        }
	        catch (Exception e) {
	            System.out.println("Invalid input! Please enter numbers only.");
	        }
	    }
	
	}
