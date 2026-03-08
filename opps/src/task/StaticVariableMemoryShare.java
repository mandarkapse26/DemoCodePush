package task;

public class StaticVariableMemoryShare {
	 
	    int rollnum; 
	    String name;
	    static String cm_name="abc";
	    
	    StaticVariableMemoryShare(int r,String nm){
	    	this.rollnum=r;
	    	this.name=nm;
	    }
	    
	    String display() {
			return "my company is "+ cm_name + "  rollnum is " + rollnum + " Name is "+ name;
	    }
	    
	public static void main(String[] args) {	
	StaticVariableMemoryShare obj1 = new StaticVariableMemoryShare(1,"Mandar"); // memory share stastic word
	System.out.println(obj1.display());		
			 
			

	}

	}


