package op;

class Maths {
    int sum(int a, int b) {
        return a + b;   // Parent logic
    }
}

class Mul extends Maths {
    @Override
    int sum(int x, int z) {
    	System.out.println(super.sum(12, 2));
        return x * z;   // Child overrides logic
    }
}

public class MathOverridingRuntime {

    public static void main(String[] args) {

    	Mul obj = new Mul();
    	System.out.println(obj.sum(15, 15));
    	
    
    	
        
}
}