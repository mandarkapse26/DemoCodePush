package breakcontinue;

import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//break
       
//		Scanner obj = new Scanner(System.in);
//		System.out.println("enter the number :");
//		int num = obj.nextInt();
//	
//	
//	    for(int a = 1 ; a <= 15 ; a++) {
//		if (a == 10) {
//		System.out.println("breake the loop at a="+ a);
//		break;
//	}
//	    
//	    System.out.println(a);
//	    }
//	    
//	    System.out.println("loop ended");
//	    
	   
	    //continue
	    
	    Scanner obj1 = new Scanner(System.in);
		System.out.println("enter the number :");
		int numb = obj1.nextInt();
	
	
	    for(int a = 1 ; a <= 15 ; a++) {
		if (a == 10) {
		System.out.println("Skipping number"+ a);
		continue;
		}
	    System.out.println(a);
	    }
	    
	    System.out.println("loop completed");
	    }
	}
	    
//	    Scanner obj1 = new Scanner(System.in);
//		System.out.println("1 to 7 :");
//		int day = obj1.nextInt();
//		
//		//1-monday,2-tuesday,3-wednesday,4-thusday,5-friday,6-saturday,7-sunday
//		
//		if(day >= 1 && day >= 5) {
//			System.out.println("it's a working day :");
//		}
//		else if(day == 4) {
//			System.out.println("it's a holiday :");
//		}
//		else {
//			System.out.println("invalid day ! enter only 1 to 7 day :");
//		}
		
		
//		
//		Scanner obj1 = new Scanner(System.in);
//		System.out.println("Enter day number(1=monday,2=tuesday,3=wednesday,4=thursday,5=friday,6=saturday,7=sunday ):");
//		String day = obj1.next().toLowerCase();
//		
//		switch (day) {
//		case "monday":
//		case "tuesday":
//		case "wednesday":
//		case "friday":
//		case "saturday":
//		case "sunday":
//			System.out.println("its a working day :");
//			break;
//		case "thursday":
//			System.out.println("its a holiday :");
//			break;
//		default:
//			System.out.println("invalid day !");
//		}

	


