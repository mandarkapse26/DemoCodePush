package opps;

public class cars {
	static int price; 			//static variable
	String model;				//instant variable
	String name;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String companyname = "diti";		//local variable
		cars c = new cars();

	c.price=23000000;
	c.model="x5";
	c.name="bmw";
	System.out.println(c.price);
	System.out.println(c.model);
	System.out.println(c.name);

	}
}