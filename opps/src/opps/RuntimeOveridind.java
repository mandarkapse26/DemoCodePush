package opps;

 class parentover{
	void jk(int age) {
		
		System.out.println("my age is second"+age);
	}
 }
public class RuntimeOveridind extends parentover {
	void jk(int age) {
		super.jk(115);
		System.out.println("my age is"+ age);
	}
		
	public static void main(String[] args) {
		RuntimeOveridind nt =new RuntimeOveridind ();
		nt.jk(144);
		
		
    
	}

}
