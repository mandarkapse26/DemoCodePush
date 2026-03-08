package comparisonOPerators;

public class condition {
	
     public static void main(String[] args) {
	
	boolean isSunUp = true;
	if (isSunUp == true)
		System.out.println("day");
	else
		System.out.println("night");
	
	int age = 17;
	if(age > 18)
		System.out.println("can vote");
	else
		System.out.println("cant't vote");
    	 
    	 
    	int a = 40;
    	int b = 50;
    	System.out.println(a < 50 && b<60);
    	 
    	int k = 15;
    	int p = 16;
    	System.out.println(k > 64 && p  < 65);
    		
    	int q = 10;
    	int x = 11;
    	System.out.println(q > 9 && x > 65);
    		
    	int c = 12;
    	int d = 13;
    	System.out.println(c > 13 && d > 12);
    	
    	
    	int n = 15;
    	int o = 20;
    	System.out.println(c > 33 || d > 22);
    	
    	int e = 23;
    	int f = 24;
    	System.out.println(e > 33 || f > 22);
    	
    	
    	int g = 23;
    	int h = 24;
    	System.out.println(g > 22 || h < 22);
    	
    	int i = 23;
    	int j = 25;
    	System.out.println(i > 22 || j < 24);
    	
    	int r = 23;
    	int m = 25;
    	System.out.println(r > 22 != m > 24);
    	
    	int v = 60;
    	int z = 70;
    	System.out.println(!(v > 59 || z > 69));
    	 
        
        }
     }
