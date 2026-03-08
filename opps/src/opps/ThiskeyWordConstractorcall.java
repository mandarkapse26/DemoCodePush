package opps;

public class ThiskeyWordConstractorcall {
 
	ThiskeyWordConstractorcall(){
		System.out.println("Non-Parametric ThiskeyWordConstractorcall constractor call");
	}
	ThiskeyWordConstractorcall(int num){
		this();
		System.out.println("Parametric ThiskeyWordConstractorcall constractor call :"+num);
	}
	public static void main(String[] args) {
		ThiskeyWordConstractorcall obj = new ThiskeyWordConstractorcall(155);
		
	
	}

}
