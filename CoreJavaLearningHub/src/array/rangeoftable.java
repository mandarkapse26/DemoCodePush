package array;

import java.util.Scanner;

public class rangeoftable {
public static void main(String[] args) {
	
	Scanner mn = new Scanner(System.in);
	System.out.println("Enter value :");
	int numb = mn.nextInt();
	System.out.println("Enter value2 :");
	int numb1 = mn.nextInt();
	
	
	for (int i = numb ; i <= numb1 ; i++) {
		for(int j = 1 ; j <= 10 ; j++) {
        System.out.println(i + " x " + j + " = " +(i*j) );
		
	}
		System.out.println("--------");
	}
}

}
