package book;



public class thiskeywordmethod {
	int id;
	String name;
	String city;
	public void first() {

		System.out.println("my id "+ id +" my name is "+ name  +" city "+city);
	}

public void second(int id,String name,String city) {
	this.id=id;
	this.name = name;
	this.city = city;
	this.first();
		
	}
	public static void main(String[] args) {
		thiskeywordmethod bb = new thiskeywordmethod();
		bb.second(1, "Mandar", "parbhani");

	}

}
