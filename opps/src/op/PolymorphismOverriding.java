package op;

//Method name same
//Parameters must be same
// Return type same

class Animal5 {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Horse extends Animal5 {
    @Override
    void sound() {
    	super.sound();
        System.out.println("Horse neighs");
    }

    void run() {
        System.out.println("Horse runs fast");
    }
}

class Cow extends Animal5 {
    @Override
    void sound() {
    	super.sound();
        System.out.println("Cow moos");
    }

    void eatGrass() {
        System.out.println("Cow eats grass");
    }
}

public class PolymorphismOverriding {

    public static void main(String[] args) {

    	Horse a1 = new Horse();
    	a1.sound();
    	a1.run();
    	
    	Cow f1 = new Cow();
    	f1.eatGrass();
    	f1.sound();
    }
}
