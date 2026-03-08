package AccessmodifierExample;

public class PrivateExampleBank {

    private int pin = 8888;   // private variable

    private void showpin() {   // private method
        System.out.println("Your PIN is: " + pin);
    }

    void accesspin(int pass) {   // default method
        this.pin = pin + pass;   // modify pin
        showpin();               // calling private method inside same class
    }

    public static void main(String[] args) {

        PrivateExampleBank ww = new PrivateExampleBank();
        ww.accesspin(2);   // ✅ Allowed
    }
}
