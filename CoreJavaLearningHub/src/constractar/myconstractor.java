package constractar;

public class myconstractor {
	
	myconstractor(){ // non - parameters
		System.out.println("i am belonging to this city!");
	}
	
	myconstractor(String city){ // parameters
		System.out.println("my city name is!"+city);
		
	}
	
	public static void main(String[] args) {
		myconstractor city = new myconstractor(); // default constractor
		myconstractor city1 = new myconstractor("Purna");
		
		

	}

}
