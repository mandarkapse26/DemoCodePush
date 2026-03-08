package whiledo;
import java.util.Scanner;
public class nested {

	public static void main(String [] args){
		
	//1 nested
//		        Scanner input = new Scanner(System.in); 
//		        System.out.print("Enter your age: ");
//		        int age = input.nextInt(); 
//
//		        
//		        if (age >= 18) {
//		            System.out.print("Enter your country: ");
//		            String country = input.next(); 
//
//		            //nested
//		            if (country.equalsIgnoreCase("India")) {
//		                System.out.println("You are eligible to vote in India!");
//		            } else {
//		                System.out.println("You are 18+, but not from India.");
//		            }
//
//		        } else {
//		            System.out.println("You are not eligible to vote yet.");
//		        }
		        
		        
		        //2. tables 
		
//		Scanner obj =new Scanner(System.in);
//		System.out.println("Enter the number first :");
//		int num = obj.nextInt();
//		System.out.println("Enter the number second :");
//		int num1 = obj.nextInt();
//		
//		System.out.println("\ntable of"+num);
//		for(int i=2;i<=10;i++) {
//			System.out.println(num+"X"+i+"="+(num*i));
//		}
//		System.out.println("\ntable of"+num1);
//		for(int i=2;i<=10;i++) {
//			System.out.println(num1+"X"+i+"="+(num1*i));
//		    }
		
		
		//3.for
//		for(int mandar=1;mandar<10;mandar++) {
//			System.out.println("mandar :"+mandar);
//		}
		
//		//Swap
//		int a=100;
//		int b =200;
//		int c;
//		System.out.println("Before swap value a :"+a +",b="+b);
//		
//		 c=a;
//		 a=b;
//		 b=c;
//		 
//		System.out.println("After swap value a :"+a +",b="+b);
		
		//Switch case
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number first :");
		double num = sc.nextDouble();
		System.out.println("Enter the number first :");
		double num1 = sc.nextDouble();
		
		
		System.out.println("Choice the operators +,-,*,/,% :");
		int operator = sc.next().charAt(0);
		double result;
		
		switch (operator) {
		case ('+'):
			result = num+num1;
			System.out.println(result+" result");
		break;
		case ('-'):
			result = num-num1;
			System.out.println(result+" result");
		break;
		case ('*'):
			result = num*num1;
			System.out.println(result+" result");
		break;
		case ('/'):
			result = num/num1;
			System.out.println(result+" result");
		break;
		case ('%'):
			result = num%num1;
			System.out.println(result+" result");
		break;
		
		
		//while
//		int mandar = 5;
//		while(mandar<50) {
//			System.out.println("value of mandar :"+mandar);
//			mandar++;
			
			//do while
//			
//			int j = 2;
//			do {
//				System.out.println("value of j :"+j++);
//			}while(j<=10);
		
		//even number
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the Value :");
//		int num = sc.nextInt();
//		
//		if(num%2==0) {
//			System.out.println("This is an even number :");
//		}else {
//			System.out.println("this is an odd number :");
//		}
		
		//odd numbetr
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the Value :");
//		int num = sc.nextInt();
//		
//		if(num%3==0) {
//			System.out.println("this is an odd number :");
//		}else {
//			System.out.println("this is an even number :");
//		}
//		
//	
		
	// reveser
		
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter the number");
//	int num = sc.nextInt();
//	int reversed = 0;
//	
//	while(num != 0) {
//		int digit = num%10;
//		reversed = reversed*10+digit;
//		num/=10;	
//	}
//	System.out.println("Reversed number :"+reversed);
	
		
		// for loop
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the number");
		
		// for loop reverse
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the number :");
//		int num= sc.nextInt();
//		int reversed = 0;
//		
//		for(;num!=0;) {
//			int digit = num%10;
//			reversed = reversed*10+digit;
//			num/=10;
//		}
//		System.out.println("enter the reversed number :"+ reversed);
//	
		//for loop String
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the name :");
//		String name = sc.nextLine();
//		
//        String reverse = " ";
//        for(int i=name.length()-1;i>=0;i--) {
//	    reverse = reverse + name.charAt(i);
//}
//       System.out.println("reverse name is : " +reverse);
       
       
//        Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the number :");
//		int num= sc.nextInt();
//		int originalNum = num;
//		int reversed = 0;
//		
//		while(num!=0) {
//			int digit = num%10;
//			reversed = reversed*10+digit;
//			num/=10;
//			
//		}
//		if(originalNum == reversed) {
//		System.out.println(originalNum+"it is an palidron number :");
//		}
//		else {
//			System.out.println(originalNum+"it is not an palidron number :");
//		}	
	}
}
}

