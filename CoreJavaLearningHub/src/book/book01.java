package book;

abstract class parent{
	
	abstract void mydetails();
	
	
	void myname() {
		System.out.println("ADitya");
	}
}

 class child extends parent{
	void myage() {
		System.out.println(20);
	}
	
	void mydetails (){
		System.out.println("my details");
	}
}
public class book01 {

	public static void main(String[] args) {
		
		
		child obj = new child();
		obj.myage();
		obj.myname();
		obj.mydetails();
		
	}
}
