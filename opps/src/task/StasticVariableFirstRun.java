package task;

public class StasticVariableFirstRun {

	   static int  age=355;  // No need obj second run 2
		 
	    int rollnum; 
	    String name;
	    static String cm_name="abc";
	    
	    StasticVariableFirstRun(int r,String nm){ // memory shrare run 3
	    	this.rollnum=r;
	    	this.name=nm;
	    }
		    
	    String display() {
			return "my company is "+ cm_name + "  rollnum is " + rollnum + " Name is "+ name;
	    }
	    
	    
	    static {
	    	System.out.println("this is static block first run"); // Static block first run 1
	    }
		public static void main(String[] args) {
			
			System.out.println( age  ); // no need object
			
			StasticVariableFirstRun obj1= new StasticVariableFirstRun(1,"atharv"); // memory share
			System.out.println(obj1.display());
			 
			StasticVariableFirstRun obj2= new StasticVariableFirstRun(2,"sumedh");
			System.out.println(obj2.display());	
			
			StasticVariableFirstRun obj3= new StasticVariableFirstRun(3,"rahul");
			System.out.println(obj3.display());
			
			
			System.out.println(cm_name+"");
		}
}
