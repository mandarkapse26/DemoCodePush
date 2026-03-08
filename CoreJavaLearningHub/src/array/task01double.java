package array;
import java.util.Scanner;
public class task01double {

	public static void main(String [] args) {
		
		int m[][]= new int [2][4];
		for(int a =0; a < m.length ; a++) {
			
			for(int b =0; b < m[a].length ; b++) {
				
				if(a==b) {
						m[a][b]=0;	
				}
				else {
						m[a][b]=1;			
						}
				System.out.print(m[a][b]+" "); 	
			}
			System.out.println();

		}
//		int ms[][]= {{2,4,6},
//				     {6,7,3,67,8},
//				     {2,5,6,7}};
//			for(int a =0; a< ms.length ; a++) {					
//						for(int b =0; b<ms[a].length ;b++) {
//							 System.out.print(ms[a][b] + " ");
//						}
//						System.out.println();
//			}
            
//			Scanner sc = new Scanner(System.in);
//			System.out.println("enter the matrix 3*5 :");
//			int a[][]=  new int[2][3];
//			
//			for(int b = 0; b<a.length;b++) {
//				for(int c = 0; c<a[b].length;c++) {
//					System.out.print("enter value["+b+"]["+c+"] :");
//					a[b][c]=sc.nextInt();
//				}
//			}
//		
//	        System.out.println("\nMatrix elements are:");
//	        for (int b = 0; b < a.length; b++) {
//	            for (int c = 0; c < a[b].length; c++) {
//	                System.out.print(a[b][c] + " ");
//	            }
//	            System.out.println();
//	        }
//	        
		
	}
}