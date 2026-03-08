package opps;

public class CompiletimeOverloading {
	
	void see(int age) {
		System.out.println("my age is "+age);
	}
	void see(int a, int b) {
		int sum = a+b;
		System.out.println("sum of two factors "+sum);
	}

	public static void main(String[] args) {
		CompiletimeOverloading sc = new CompiletimeOverloading();
		sc.see(25);
		sc.see(15, 15);

	}

}
