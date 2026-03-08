package constractar;

public class numberandnameexample {
	String mathamatic;
	numberandnameexample(String name){
		mathamatic=name;
		System.out.println(name);
	}
	void display(){
		System.out.println(mathamatic);
	
	}
	public static void main(String[] args) {
	
		numberandnameexample mn = new numberandnameexample("mandar");
		mn.display();
		
		
	}

}
