package array;

import java.util.Scanner;

public class trycatchfinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter first value :");
			int num = sc.nextInt();
			System.out.println("Enter second value :");
			int num1 = sc.nextInt();
			int result = num/num1;
			System.out.println(result);
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("this is the finally block");
		}
	}

}
