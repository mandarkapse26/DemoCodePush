package factorialnumber;

import java.util.Scanner;

public class task {
	public static void main(String[] args) {
	
	// FACTORIAL LOOP
	
	    Scanner obj1 = new Scanner(System.in);
	    System.out.println("Enter the number :");
	    int num = obj1.nextInt();
	    
	    //initial values
	    int fact = 1;
	    for(int i = 1; i <= num; i++) {
	    	fact = fact*i;
	    	
	    	
	    }
	    System.out.println("factorial of"+num+"is:"+fact);
	    
}
}
