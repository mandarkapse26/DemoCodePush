package vishal;

import java.util.Scanner;

public class kapse {

	public static void main(String[]args) {
	
//		System.out.println("sir"
//				+ "name vishal kapse\n"
//				+ "age 26\n"
//				+ "college sgbm\n"
//				+ "city purna\n"
//				+ "pincode 431511\n"
//				+ "addres at post nila"
//				+ "father name Baluappa\n"
//				+ "mother name indu\n"
//				+ "date of birth 23/01/01\n"
//				+ "degree BEd\n"
//				+ "blood g o\n"
//				+ "mobile no 9673376076\n"
//				+ "height 167.5\n");
		
		// arithematic op
		
//		Scanner obj = new Scanner(System.in);
//		System.out.println("Enter the name :");
//		String name = obj.nextLine();
	
////	  1.StringBuilder
//		
//		StringBuilder sc = new StringBuilder("9673376076");
//		for(int i=0; i<sc.length()/2;i++) {
//			int front = i;
//			int back = sc.length()-1-i;
//			
//			char frontchar = sc.charAt(front);
//			char backchar = sc.charAt(back);
//			
//			sc.setCharAt(front, backchar);
//			sc.setCharAt(back, frontchar);
//			
//		}
//		System.out.println(sc);
//		
//		// 2.if else
//		Scanner pm = new Scanner(System.in);
//		System.out.println("Enter the Boolean:");
//		boolean sunUp = pm.nextBoolean();
//		
//		if(sunUp) {
//			System.out.println("day");
//			
//		}else {
//			System.out.println("night");
//		}
//		
//		//3.Switch loop
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter first value :");
		double nam1 = Sc.nextDouble();
		System.out.println("Enter Second value :");
		double nam2 = Sc.nextDouble();
		
		System.out.println("choice the  operator +,-,*,%,/");
		int operator = Sc.next().charAt(0);
		double result;
		
		switch (operator) {
		case('+'):
			result = nam1+nam2;
		  System.out.println(result+"result");
		  break;
		case('-'):
			result = nam1-nam2;
		  System.out.println(result+"result");
		  break;
		case('*'):
			result = nam1*nam2;
		  System.out.println(result+"result");
		  break;
		case('/'):
			result = nam1/nam2;
		  System.out.println(result+"result");
		  break;
		case('%'):
			result = nam1%nam2;
		  System.out.println(result+"result");
		  break;
		}
		
		//4. evennumber
//		Scanner mk = new Scanner(System.in);
//		System.out.println("Enter the number :");
//		int num = mk.nextInt();
//		
//		if(num%2==0) {
//			System.out.println("this is an even number");
//		}else {
//			System.out.println("this is an odd number");
//		}
		
		//1
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter you age :");
//		int age = sc.nextInt();
//		
//	
//		if(age>=18) {
//			System.out.println("Enter you country!");
//			String state = sc.next();
//			
//			if(state.equalsIgnoreCase("indian")) {
//				System.out.println("You are eligible to vote in India!");
//				
//			}else {
//				System.out.println(" You are 18+, but not from India.");
//			}
//		}
//			else {
//				System.out.println("You are not eligible to vote yet.");
//				
//			}
		
		
		//2
		
//		try {
//			for(int i = 0; i<=10; i++) {
//				System.out.println("hello word");
//			
//			Thread.sleep(1000);}
//		} catch (InterruptedException e) {
//						e.printStackTrace();
//		}
		
		
		
		}		
}
