package opps;

import java.util.Scanner;

public class sweet {

	public static void main(String[] args) {
		
	

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of students: ");
	        int students = sc.nextInt();

	        System.out.print("Enter number of subjects: ");
	        int subjects = sc.nextInt();

	        int[][] marks = new int[students][subjects];

	        // Taking input
	        for (int i = 0; i < students; i++) {
	            System.out.println("Enter marks for Student " + (i + 1));

	            for (int j = 0; j < subjects; j++) {
	                System.out.print(" Subject " + (j + 1) + ": ");
	                marks[i][j] = sc.nextInt();
	            }
	        }

	        // Printing marks and total
	        for (int i = 0; i < students; i++) {
	            int total = 0;
	            System.out.println("\nStudent " + (i + 1) + " Marks:");

	            for (int j = 0; j < subjects; j++) {
	                System.out.println(" Subject " + (j + 1) + ": " + marks[i][j]);
	                total = total + marks[i][j];
	            }

	            System.out.println(" Total Marks = " + total);
	        }

	        sc.close();
	    }
	}
