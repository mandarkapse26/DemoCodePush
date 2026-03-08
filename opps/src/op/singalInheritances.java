package op;
class parent{
	void money() {
		System.out.println("total money 1000");
	}
}
class child extends parent{
	void pocketMoney() {
		System.out.println("give me a 100Rs");
	}
}

public class singalInheritances {

	public static void main(String[] args) {
		child cc = new child();
		cc.pocketMoney();
		cc.money();
		

	}

}
