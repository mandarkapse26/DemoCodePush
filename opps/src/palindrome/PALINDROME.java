package palindrome;

import java.util.Scanner;

public class PALINDROME {
	public static void main(String[] args) {  
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value :");
		int num = sc.nextInt();
		int originalNum = num;
		int reverse = 0;
		
		while(num !=0) {
			int m = num%10;
			reverse = reverse*10+m;
			num/=10;
			
		}
			if(originalNum == reverse) 
				System.out.println(originalNum + " it's a palindrom number :");
			
			else 
				System.out.println(originalNum + "it's not a palindrom number :");
			
			
		}
	}

