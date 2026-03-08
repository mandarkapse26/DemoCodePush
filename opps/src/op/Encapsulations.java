package op;

class Bank {
    private int pin = 1234;   // hidden data

    public void set(int pass) {   // setter method
        pin = pass;
    }

    public int get() {           // getter method
        return pin;
    }
}

public class Encapsulations {

    public static void main(String[] args) {
        Bank obj = new Bank();

        obj.set(1478);  // updating pin
        System.out.println("Your new pin is " + obj.get());
        
        //Encapsulation is the process of wrapping data (variables) and methods into a single unit (class) 
        //and restricting direct access to the data by making 
        //it private and accessing it through public methods (getter/setter).
    }
}
