package fibonacci;

import java.util.Scanner;

public class task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many numbers you want: ");
        int n = sc.nextInt();

        int first = 0, second = 1;

        System.out.print("Fibonacci Series: " + first + " " + second);

        for (int i = 2; i < n; i++) {
            int RESULT = first + second;
            System.out.print(" " + RESULT);
            first = second;
            second = RESULT;
		        }
		    }

}
