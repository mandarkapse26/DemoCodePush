package opps;

class parent{
	void money() {
		System.out.println("No money at this moment :");
	}
}
class child extends parent{
	void cash(){
		System.out.println("need for some money in upi :");
	}
}

public class InheritanceSingleLevel {

	public static void main(String[] args) {
		child sc = new child();
		sc.cash();
        sc.money();  
	}

}
