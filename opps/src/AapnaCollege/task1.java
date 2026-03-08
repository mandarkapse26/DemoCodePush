package AapnaCollege;
class pen{
	String color;
	String type; // ballpoint ; // GEL
	public void write() {
		System.out.println("writing something");
	}	
		public void printColour() {
			System.out.println(this.color);
			
		}
	}


public class task1 {

	public static void main(String[] args) {
		pen obj = new pen();
		obj.color = "blue";
		obj.type = "gel";
		System.out.println("Pen color: " + obj.color);
        System.out.println("Pen type: " + obj.type);
		obj.write();
		
		pen obj1 = new pen();
		obj1.color="black";
		obj1.type= "ballpoint";
		
		obj.printColour();
		obj1.printColour();
	

	}

}
