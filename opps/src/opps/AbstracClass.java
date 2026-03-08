package opps;

abstract class car{
	abstract void start();

 void  stop () {
	 System.out.println("A car stop");
 }}
 class maruti extends car{
	 void start() {
		 System.out.println("maruti has a good maileage");
	 }
 }
public class AbstracClass {
	 

	public static void main(String[] args) {
    maruti zz = new maruti();
    zz.start();
    zz.stop();
	}

}
