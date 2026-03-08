package array;
import java.util.Arrays;
import java.util.Scanner;

public class task {

	public static void main(String [] args) {
		
//		int[]num = {10,20,30,40,50};
////		int[]num = {50};
//		System.out.println("print the value :");
//		
//		for(int a = 0; a < num.length; a++) {
//			System.out.println(num[a]);
//		}
	
		
		
//		int arr[] = new int[4];
//		arr[0] = 10;
//		arr[1] = 20;
//		arr[2] = 30;
//		arr[3] = 40;
//	
//		System.out.println(arr[2]);
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter arr value :");
//		int w[]=new int[5];
//		for(int a = 0; a<5; a++) {
//			w[a]=sc.nextInt();
//		}
//		System.out.println("array elements:");
//		for(int q:w) {
//			System.out.print(q + " ");
//		}
		
//		Scanner sc = new Scanner(System.in);
//		int size = sc.nextInt();
//		int number[] = new int[size];
//		
		// out put
//		for(int a = 0; a<size; a++) {
//		System.out.println(number[a]);
//	}
		
		// input
		
//		for(int a = 0; a<size; a++) {
//			number [a] = sc.nextInt();
//		}
//		
//		
//		// linear search
//		
//		int x = sc.nextInt();
//		for(int a = 0; a<number.length; a++) {
//			if(number[a] == x) {
//			System.out.println("x found at index :"+a);
//		}
//	}
		
//		int[] mark = {10,20,30,40,50,60};
//		String[] name = {"ankit","mandar","Aditya","vishal","diti","city"};
//		System.out.println(Arrays.toString(mark));
//		System.out.println(Arrays.toString(name));
//		for(int i =0; i<mark.length; i++) {
//				System.out.println("Index: " + i + " | Name: " +name[i] + " | Mark: " + mark[i]);
 
				

//		        Scanner sc = new Scanner(System.in);
//		        System.out.println("Enter 6 numbers:");
//                int size = 6;
//                int [] marks = new int[size];
//		        
//		        for(int i = 0; i < size; i++) {
//		            marks[i] = sc.nextInt();
//		        }
//		        int max = marks[0];
//		        for(int i = 1; i < 6; i++) {
//		            if(marks[i] > max) {
//		                max = marks[i];
//		            }
//		        }
//
//		        System.out.println("Largest number is: " + max);
//		      
//		        Scanner sc = new Scanner(System.in);
//		        System.out.println("Enter 6 number :");
//		        int size = 6;
//		        int[] mark = new int[size];
//		        
//		        for(int i=0; i<6; i++) {
//		        	mark[i]=sc.nextInt();
//		        	
//		        }
//		        
//		        int max = mark[0];
//		        for(int i=1;i<size;i++) {
//		        	if(mark[i]>max) {
//		        	 max = mark[i];
//		        }
//		        } 
//		        System.out.println("greater number :" +max);
		        
		        
//		        Scanner sc = new Scanner(System.in);
//		        System.out.println("Enter the name :");
//		        String name = sc.nextLine();
//		        System.out.println("Enter index Value :");
//		        int index = sc.nextInt();
//		        
//		        if(index >= 0 && index < name.length() ) {
//		        	char ch = name.charAt(index);
//		        	System.out.println("Character index "+name+ " is "+ch);
//		        }
//		        else {
//		        	System.out.println("invalid value");
//		        }
		        //IF - else
//		        Scanner sc = new Scanner(System.in);
//		        System.out.println("Enter the  name :");
//		        String name = sc.nextLine();
//		        System.out.println("choose the value 1 for uppercase and value 2 for lowercase :");
//		        int choose = sc.nextInt();
//		        
//		        if(choose==1) {
//		        	System.out.println("UPPER CASE:"+name.toUpperCase());
//		        } else if(choose==2){
//		        System.out.println("Lower CASE:"+name.toLowerCase());
//		        }else {
//		       System.out.println("inVALID NUMBER");
//		        }
		        
		        
		        Scanner mn = new Scanner(System.in);
		        System.out.println("enter the name:");
		        String name = mn.nextLine();
		        System.out.println("choose the value 1 for uppercase and value 2 for lowercase :");
		        
		        int input = mn.nextInt();
		        
		        switch(input) {
		        case 1:
		        	System.out.println("UPPER CASE:"+name.toUpperCase());
		        	break;
		        case 2:
			        System.out.println("Lower CASE:"+name.toLowerCase());
                    break;
		        default:
		        	System.out.println("invalid");
		        }
	}	
		}

