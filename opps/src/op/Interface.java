package op;

interface Animal{
	int  numofcow= 5;  // constant
	void sound ();     // abstract methods
}

 class cow implements Animal{
	 public void sound() {
		 System.out.println("Cow says Moo");
		 System.out.println(numofcow);
	 }
 }

public class Interface {

	public static void main(String[] args) {
		
		cow jj = new cow();
		jj.sound();

	}

}
