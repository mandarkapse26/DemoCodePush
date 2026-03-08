package variablestask;

public class task {
 	int result;
	int rollno = 401;
	int studentid = 404;
	
	task(){
		result = rollno+studentid;
	}
	void demo() {
		System.out.println("result :"+ result);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		task sc = new task();
	    sc.demo();
	}

}
