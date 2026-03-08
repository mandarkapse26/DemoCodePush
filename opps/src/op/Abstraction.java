package op;
abstract class vehicle{
	abstract void start(); // 100% 
	
	void stop() {            // 0% concrete method
        System.out.println("Vehicle stopped"); 
    }
}
	class Car extends vehicle{
		void start() {
			System.out.println("Car start with key");
		}
		
	}

public class Abstraction {

	public static void main(String[] args) {
		
		Car nn = new Car();
			nn.start();
			nn.stop();
		}
	}
