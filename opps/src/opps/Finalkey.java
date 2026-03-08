package opps;

class p{
	
	final  void parentm(int a) {
		System.out.println("a="+a);
	}
}

public class Finalkey extends p {
	 void parentj() {
		System.out.println("ok ");
	}
	
	public static void main(String[] args) 
	{
		 Finalkey vv = new  Finalkey();
		 vv.parentm(45);
      
	}

}
