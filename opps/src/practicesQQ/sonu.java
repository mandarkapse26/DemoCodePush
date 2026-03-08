package practicesQQ;

import java.util.Scanner;

public class sonu {
	
	public static void main(String[] args) {
	
	//Assignment op
	
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter value : ");
//	int value = sc.nextInt();
//	System.out.println("Enter value1 ; ");
//	int value1 = sc.nextInt();
//	int result;
//	
//	result = value += value1;
//	System.out.println("Addition value += value1 :"+value);
//	
//	
//	result = value -= value1;
//	System.out.println("substraction value -= value1 :"+value);
//	
//	
//	result = value *= value1;
//	System.out.println("Multiplication value *= value1 :"+value);
//	
//	
//	result = value /= value1;
//	System.out.println("division value /= value1 :"+value);
//	
//	result = value %= value1;
//	System.out.println("modulo value %= value1 :"+value);
//	
//	result = value = value1;
//	System.out.println("equal value = value1 :"+value);
//	
//
//		//logical op
//		Scanner sc1 = new Scanner(System.in);
//		System.out.println("Enter first a :");
//		int a = sc1.nextInt();
//		System.out.println("Enter second b :");
//		int b = sc1.nextInt();
//		int result2;
//		
////		result = (a<50 && b<60);
//		System.out.println("and :"+(a<50 && b<60));
//		
////		result = (a<40 && b<44);
//		System.out.println("and :"+(a<40 && b<44));
//		
////		result = (a<54 && b<55);
//		System.out.println("and :"+(a<54 && b<55));
//		
//////		result = (a<35 && b<36);
//		System.out.println("and :"+(a<35 && b<36));
//	
//		
//		//arithmetic op
//		
//		Scanner obj = new Scanner(System.in);
//		System.out.println("Enter the code :");
//		int code = obj.nextInt();
//		System.out.println("Enter the code1 :");
//		int code1 = obj.nextInt();
//		int result3;
//		
//		System.out.println("Addition :"+(code+code1));
//		System.out.println("subs :"+(code-code1));
//		System.out.println("multi :"+(code*code1));
//		System.out.println("divi :"+(code/code1));
//		System.out.println("mod :"+(code%code1));
//		
//		
//		
//		//Comparison op
//		Scanner obj1 = new Scanner(System.in);
//		System.out.println("Enter the amount :");
//		int amount = obj1.nextInt();
//		System.out.println("Enter the amount1 :");
//		int amount1 = obj1.nextInt();
//		int result4;
//		
//		
//		System.out.println("== :"+(amount==amount1));
//		System.out.println("!= :"+(amount!=amount1));
//		System.out.println("-= :"+(amount-=amount1));
//		System.out.println("> :"+(amount>amount1));
//		System.out.println("< :"+(amount<amount1));
//		System.out.println(">= :"+(amount>=amount1));
//		System.out.println("<= :"+(amount<=amount1));
//		
//		String fullname = "Mandar Babanappa Kapse";
//		String name = fullname.substring(6,fullname.length());
//		System.out.println(name);
//		
//		String mn = "vishal baluappa kapse";
//		String kp = mn.substring(7, 15);
//		System.out.println(kp);
		
//		StringBuilder mn = new StringBuilder("Mandar");	
//		System.out.println(mn);
//		
//		// cahrAt index 0
//		System.out.println(mn.charAt(0));
//		
//		//set char at 
//		mn.setCharAt(0, 'A');
//		System.out.println(mn);
//		
//		//insert
//		mn.insert(0, 'j');
//		System.out.println(mn);
//		
//		//delete the extra a
//        mn.delete(0,2);
//        System.out.println(mn);
//        
//        //append
//        mn.append('m');
//        mn.append('a');
//        mn.append('n');
//        mn.append('d');
//        mn.append('a');
//        mn.append('r');
//        System.out.println(mn.length());
//        
        //reveser
        StringBuilder jk = new StringBuilder("Mandarkapse");
        for(int i=0 ; i<jk.length()/2;i++) {
        	int front = i;
        	int back =jk.length()-1-i;
        	char frontchar = jk.charAt(front);
        	char backchar = jk.charAt(back);
         jk.setCharAt(front, backchar);
         jk.setCharAt(back, frontchar);
         
        }
        System.out.println(jk);	
	
        
	}
        }
	
