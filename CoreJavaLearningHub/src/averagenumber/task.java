package averagenumber;

import java.util.Scanner;

public class task {
	
	public static void main(String [] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 3 number :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		double average = (a+b+c)/3;
		System.out.println("average =" +average);
}       

}
