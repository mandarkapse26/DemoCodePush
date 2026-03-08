package opps;

class parentdata{
	
	protected int hight=33;
}

public class codeprotected  extends parentdata{
	
//	private int hight=500;
	
	public static void main(String[] args) {
		codeprotected n= new codeprotected();
		System.out.println(n.hight);
	}

}
