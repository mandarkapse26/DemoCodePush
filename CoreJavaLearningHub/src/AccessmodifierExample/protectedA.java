package AccessmodifierExample;

// Parent class
class ProtecterExam {
	protected String name="Mandar";
	 
}
// Child class
 public class protectedA extends ProtecterExam {
	 
	  public static void main(String[] args) {
		  protectedA c=new protectedA();
		    	System.out.println(c.name);
		 }   
   
}
