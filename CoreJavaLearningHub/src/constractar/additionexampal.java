package constractar;

public class additionexampal { 
	static int rollno = 101; // static variable
	int age = 20; //instant variable
	void demo() { // non-paramaters
		System.out.println("multipal");
	}
	
	additionexampal (){ //non parameter 
		System.out.println("diti");
	}
	
	additionexampal(int age){ //parameter
		System.out.println(age);
	}
	int multi(int a, int b) // paramaters
	{
	 	int result=a*b;
		return result;
	}
	
	static void div(int a, int b)
	{
		int result=a/b;
		System.out.println("division of two number :" + result);
	}
	
	public static void main(String[] args) {
		additionexampal sc = new additionexampal(); // default constructor
		sc.demo();
		System.out.println(sc.multi(30,4));
		div(4,2);
		
         int num = 9282;   //local variable
         System.out.println(num);  //local variable called
         System.out.println(sc.age); //instant variable called
         System.out.println(sc.rollno);  //static variable called
         additionexampal obj = new additionexampal(12);
	}

}
