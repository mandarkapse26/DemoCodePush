package opps;

class parent13 {
	int a =10;
	void demo() {
		System.out.println("parent Superkeyworduse method");
	}
	parent13(){
		System.out.println("parent constructor");
	}
	
}
public class superkeywordchildtoparent extends parent13{
		int v= 100;	
		void demo() {
			super.demo();
			System.out.println("child demo method ");
		}
		superkeywordchildtoparent(){
			super();
			System.out.println("Child class constractor call");
		}
		void show() {
			System.out.println(this.v);
			System.out.println(super.a);
		}
		
public static void main(String[] args) {
	  superkeywordchildtoparent xx = new superkeywordchildtoparent();
       xx.show();
       xx.demo();
  
	}

}

