package AccessmodifierExample;

public class DefaultKeyword {
	int mark = 99;
	
	void showmark() {
		System.out.println(mark);
	}

	public static void main(String[] args) {
		DefaultKeyword qq = new DefaultKeyword();
		qq.showmark();
		
	}

}
