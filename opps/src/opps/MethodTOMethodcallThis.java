package opps;

public class MethodTOMethodcallThis {
	void mk() {
		this.show();
	}
	void show() {
		System.out.println("show method call immediate");
	}

	public static void main(String[] args) {
		MethodTOMethodcallThis tt = new MethodTOMethodcallThis();
		tt.show();

	}

}
