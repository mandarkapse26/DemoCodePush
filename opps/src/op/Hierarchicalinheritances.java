package op;

class dad{
	void money(){
		System.out.println("total money is 1000");	
	}
}
class son extends dad{
	void pocketM() {
		System.out.println("Son give his father 400 as pocket money");
	}
}
class Son2 extends dad{
	void pocketA() {
		System.out.println("Son2 gives his father 500 as pocket money");
	}
}

public class Hierarchicalinheritances {

	public static void main(String[] args) {
		son sn = new son();
		sn.money();
		sn.pocketM();
		
		Son2 sa = new Son2();
		sa.money();
		sa.pocketA();
	}

}
