package opps;
class parent2{
	void money() {
		System.out.println("my total balance 3000");
	}
}
class mothabhau1 extends parent2{
	void cash() {
		System.out.println("i need 1000 ruppy mothabhau");
	}
}
class chotabhau2 extends parent2{
	void cash1() {
		System.out.println("i need 1000 ruppy chotabhau");
	}
}
class chotibahin extends parent2{
	void cash2() {
		System.out.println("i need 1000 ruppy chotibahin");
	}
}
public class HierarchicalLevel {

	public static void main(String[] args) {
		chotibahin mn = new chotibahin();
		mn.cash2();
		mn.money();
		
		chotabhau2 mv = new chotabhau2();
		mv.cash1();
		mv.money();
		
		mothabhau1 nn = new mothabhau1();
		nn.cash();
        nn.money();
	}

}
