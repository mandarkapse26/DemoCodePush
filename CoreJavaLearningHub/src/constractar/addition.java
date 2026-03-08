package constractar;

public class addition {
//	int a,b,sum;
	

    void demo(int s,int r) {
//    	a=s;
//    	b=r;
//    	sum = a+b;
    	int sum = s+r;

    	System.out.println("sum of two number :" + sum);
    }
    
	public static void main(String[] args) {
		addition sw=new addition();
		sw.demo(3,5);
		sw.demo(23,45);
		sw.demo(53,75);
		sw.demo(63,5);
		sw.demo(3,54);
	}

}
