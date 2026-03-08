package opps;

public class THISKeywordsinstant {
	int age = 0;
	
	void display(int age) {
		this.age = age;
	}
	void show() {
		System.out.println("my age is a"+age);
	}

	public static void main(String[] args) {
		THISKeywordsinstant bb = new THISKeywordsinstant();
		bb.display(24);
		bb.show();
		

	}

}
