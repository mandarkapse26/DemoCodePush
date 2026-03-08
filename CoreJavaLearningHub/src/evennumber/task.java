package evennumber;

import java.util.Scanner;

public class task {
	public static void main(String [] args) {
		
		//even
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = sc.nextInt();
		
		if(num%2 == 0) 
			System.out.println("this number is even :");
		
		else 
			
		System.out.println("that number is odd :");
	}
	

}
