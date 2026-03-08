package whiledo;

import java.util.Scanner;
	
public class task {
 
	public static void main(String [] args) {
		
//		// for
//		for(int m = 1; m<10 ; m++)
//			System.out.println("value for m"+m );
		
		//for
		
//		int k = 1;
//		while(k<5)
//		System.out.println("value for k"+k++);
//		
		
		
		//do
//		int c=1;
//		do{
//			
//			System.out.println("value for c"+c++);
//		}while(c<=5);
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first value :");
		int n = sc.nextInt();
		int result;
		
		for(int m = 1; m<=n ; m++)
			System.out.println("for loop :"+m );
		
		int p = 1;
		while(p<=n) {
			System.out.println("while loop :"+p);
			 p++;
		}
		
		int z =1;
		do {
			System.out.println("do-while loop :"+z);
			z++;
		}while(z<=n);
	
	
	}
	}
