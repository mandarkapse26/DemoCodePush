package condition;

import java.util.Scanner;

public class ifelse {
	
	public static void main(String[] args) {
		
//		int percentage = 95;
//		if(percentage >= 95 ) {
//			System.out.println("you got grade positive");
//		}else {
//			System.out.println("your grade fail");
//		}
//		Scanner obj = new Scanner(System.in);
//		System.out.println("Enter percentage :");
//		int percentage = obj.nextInt();
//		
//		if(percentage >= 95 ) {
//			System.out.println("you got grade A+");
//		}
//		 else if (percentage >= 85) {
//			System.out.println("your got grade B");
//		}
//		 else if (percentage >= 75) {
//			 System.out.println("you got grade c");
//		 }
//		 else {
//			 System.out.println("you are fail");
//		 }
		
		
		// scanner if, else if
		
		
//		Scanner obj = new Scanner(System.in);
//		System.out.println("Enter percentage :");
//		int percentage = obj.nextInt();
//		int result;
//		
//		if(percentage >= 90 && percentage <= 99 ) {
//			System.out.println("you got grade A+");
//		}
//		 else if (percentage >= 80 && percentage <= 89) {
//			System.out.println("your got grade B");
//		}
//		 else if (percentage >= 70 && percentage <= 79) {
//			 System.out.println("you got grade c");
//		 }
//		 else {
//			 System.out.println("you are fail");
//		 }
		
		
		
		//nested if/ if
//		int age = 18;
//		int weight = 50;
		
//		Scanner obj = new Scanner(System.in);
//		System.out.println("Enter age :");
//		int age = obj.nextInt();
//		
//		Scanner obj1 = new Scanner(System.in);
//		System.out.println("Enter weight :");
//		int weight = obj1.nextInt();
//	
//		if(age > 18) {
//			if(weight > 45) {
//				System.out.println("you can donate blood :");
//			}else {
//				System.out.println("your weight is small :");
//		         }
//		}
//		else 
//		{
//			System.out.println(" you are fail :");
//		}
		
		
//		
//		Scanner obj = new Scanner(System.in);
//		System.out.println("sunis up positions :");
//		boolean sunpostion = obj.nextBoolean();
//		if(sunpostion==true  ) {
//			System.out.println("daY");
//				
//		}else  {
//			System.out.println("night");
//		
//	}
		
		//switch op
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1 value :");
		int num1 = sc.nextInt();
		System.out.println("Enter the 2 value :");
		int num2 = sc.nextInt();
		int result;
		System.out.println("Choose operator :+,-,/,*");
		char operator= sc.next().charAt(0);
		
		switch(operator) {
		case '+':
		result=num1+num2;
		System.out.println("addition :"+result);
		break;
		case '-' :
		result=num1-num2;
		System.out.println("subs :"+result);
		break;
		case '*':
			result=num1*num2;
		System.out.println("mul :"+result);
		break;
		case '/':
			if(num1!=0 && num2!=0) {
			result = num1/num2;
			}else {
				System.out.println("cannot divided by zero ");
			}
			break;
		default:
			System.out.println("Invalid operator");
		
	
		
		}
		
		
//		int a=10;
//		int b=20;
//		int operator = '*';
//	    switch(operator) {
//		case '+':
//		System.out.println(a+b);
//		break;
//		case '-':
//			System.out.println(a-b);
//			break;
//		case '*':
//			System.out.println(a*b);
//			break;
//		case '/':
//			System.out.println(a/b);
//			break;
//		default:
//			System.out.println("invaild operator");
//	}
		//even && odd number
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter your numb :");
//		int numb = sc.nextInt();
//		
//		if(numb%2 ==0) {
//			System.out.println(numb+"is the even number");
//		}else {
//			System.out.println(numb+"is the odd number");
//		}
		
		// positive & negative values
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter your numb :");
//		int numb = sc.nextInt();
//		
//		if(numb>0) {
//			System.out.println(numb+"is the postive number");
//		}else if (numb<0)
//		{
//			System.out.println(numb+"is the negative number");
//			}
//		else {
//			System.out.println(numb+"is the zero number");
//		}
	}
}
