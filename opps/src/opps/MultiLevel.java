package opps;

class parent1 {
	void demo1() {
		System.out.println("i have a 1000 ruppy");
	}
}
class mothabhau extends parent1{
	void demo2() {
		System.out.println("you give me 500 ruppy mothabhau");
	}
}
class chotabhau extends mothabhau{
	void demo3() {
		System.out.println("you give me 300 ruppy chotabhau");
	}
}
class khupchotabhau extends chotabhau{
	void demo4() {
		System.out.println("you give me 150 ruppy khupchota bhau");
	}
}
public class MultiLevel {

	public static void main(String[] args) {
		khupchotabhau mk = new khupchotabhau();
		mk.demo1();
		mk.demo2();
		mk.demo3();
	    mk.demo4();
	}

}
