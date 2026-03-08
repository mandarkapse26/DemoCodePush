package op;
  // Overloading
	// Same method name, different parameters
	class math{
		int add(int a, int b,int c) {
			return a+b+c;
		}
		
		int add(int d, int f) {
			return d+f;
		}
	}

public class PolymorphismOverloading {

	public static void main(String[] args) {
		
		math obj = new math();
		System.out.println("sum of two parameter :"+obj.add(44, 6));
		System.out.println("sum of three parameter :"+obj.add(14, 5, 1));
	

	}

}
