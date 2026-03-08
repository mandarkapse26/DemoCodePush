package task;

import java.util.Scanner;

public class task1 {
public static void main(String[] args) {
             // Q.1 
//	        int length = 0;
//	        for(char i='a'; i<='z'; i++) {
//	        	System.out.print(i);
//	        	length++;
//	        }
//	        System.out.println();
//	        System.out.print(length+" length");
//
//	        Scanner sc = new Scanner(System.in);
//	        System.out.print("Enter a character: ");
//	        char ch = sc.next().charAt(0); 
//
//	        
//	        if (ch >= 'a' && ch <= 'z') {
//	            System.out.println(ch + " small is an alphabet ");
//	        }
//	        else if(ch >= 'A' && ch <= 'Z') {
//	        	System.out.println(ch + " Capital is an alphabet ");
//	        }else {
//	        	System.out.println(ch +" it is not a alphabet");
//	 
//}
//	        //Q.2 factorial
//	        
//	     
//	        for(int num=3; num<=9; num++) {
//	        int fact=1;
//	        	
//	        	for (int i = 1; i<=num; i++ )
//	        	{
//	        	 fact = fact*i;	 
//	        }System.out.println("factorial of" + num + " = " + fact); 
	
	       // Q.3
	             
	        
	      //  Q.4
	
//	       int [] num = {10,20,30,40,50,60};
//	       int max = num[0];
//	       for(int i = 0; i<num.length; i++) {
//	    	   if(num[i]>max) {
//	    	   max=num[i];
//	    	   }
//	       }
//	    	   System.out.println("max"+max);
//	    	   
	    	   
//	    	   Scanner sc = new Scanner(System.in);
//	    	   System.out.println("Enter the array size ");
//	    	   int num = sc.nextInt();
//	    	   int []arr = new int[num];
//	    	   System.out.println("Enter the array element :");
//	    	   
//	    
//		       int max = arr[0];
//		       for(int i = 0; i<arr.length; i++) {
//		    	   arr[i]=sc.nextInt();
//		    	   }
//		       
//		    	  int max1=arr[0];
//		    	  for(int i=1 ; i<arr.length; i++ ) {
//		    		  if(arr[i]>max1) {
//		    			  max1=arr[i];
//		    		  }
//		    	   }
//		    	   System.out.println("max"+max1);
	
	
	              // Q.5
	        
//	        Scanner sc = new Scanner(System.in);
//	        System.out.print("Enter the number of elements: ");
//	        int n = sc.nextInt();
//	        
//	        int[] arr = new int[n];
//
//	        System.out.println("Enter " + n + " numbers:");
//	        for (int i = 0; i < n; i++) {
//	            arr[i] = sc.nextInt();
//	        }
//
//	        // Sorting in ascending order
//	        for (int i = 0; i < n; i++) {
//	            for (int j = i + 1; j < n; j++) {
//	                if (arr[i] > arr[j]) {
//	                    // Swap
//	                    int temp = arr[i];
//	                    arr[i] = arr[j];
//	                    arr[j] = temp;
//	                }
//	            }
//	        }
//
//	        // Output the sorted array
//	        System.out.println("Array in Ascending Order:");
//	        for (int i = 0; i < n; i++) {
//	            System.out.print(arr[i] + " ");
//	        }
//	    }
//	}

           
//             int arr [] = {10,20,30,40,50,60};
//             System.out.println("original array ;");
//             for(int i=0; i<arr.length; i++) {
//            	 System.out.println(arr[i]);
//             }
//             int temp =0;
//             for(int i=0; i<arr.length; i++ ) {
//            	 for(int j= i+1 ; j<arr.length; j++) {
//            	 
//            		 if(arr[j]<arr[i]) {
//            			 temp = arr[i];
//            			 arr[i]=arr[j];
//            			 arr[j]=temp;
//            			 
//            		 }
//            	 }
//             }



	          
		    	  // Q.6
		    	   
//		    	   Scanner sc = new Scanner(System.in);
//		    	   System.out.println("Enter the name :");
//		    	   String name = sc.next();
//		    	   
//		    	   System.out.println(name.toLowerCase());
//		    	   System.out.println(name.toUpperCase());
	
	               // Q .7 ZERO EXCEPTION
	
	try {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the first number :");
		int num1 = sc.nextInt();
		System.out.println("Enter the Second number :");
		int num2 = sc.nextInt();
		if(num2==0) {
			throw new Exception("Can divide by zero");
		}
		int result = num1/num2;
		System.out.println("result"+result);
		
	}catch(Exception e){
		e.printStackTrace();
		System.out.println(e.getMessage());
	}
		
	}}



	
	
		    	   
             
             
	  
	


