package constractar;

public class constractarctask {

	constractarctask(){
		System.out.println("data running here...");
	}
	
	constractarctask(int a){ 
		System.out.println("data running here..." + a);
	}
	
	
	public static void main(String[] args) {
		constractarctask obj=new  constractarctask();
		constractarctask obj2=new  constractarctask(20);

	}

}
