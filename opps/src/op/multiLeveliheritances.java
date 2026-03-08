package op;

class dad1 {
	void money() {
		System.out.println("Dad total money 1500");
	}
}
class mson extends dad {
	void money1() {
		System.out.println("son gives his father 500 as pocket money");
	}
}
class smallSon extends mson {
	void money2() {
		System.out.println("smallSon gives his father 250 as pocket money");
	}
}

class VsmallSon extends smallSon {
	void money3() {
		System.out.println("VsmallSon gives his father 150 as pocket money");
	}
}

public class multiLeveliheritances {

	public static void main(String[] args) {
		VsmallSon obj = new VsmallSon();
		obj.money();
		obj.money1();
		obj.money2();
		obj.money3();

	}

}
