package opps;

public class Encapsulation {
	private int bal = 0;
	
	void setbal(int amount) {
		bal = bal +amount;
	}
	private void getbal() { 
		System.out.println("my balances is "+bal);
	}

	public static void main(String[] args) {
		Encapsulation bb = new Encapsulation();
		bb.setbal(1000);
		bb.getbal();
		

	}

}
