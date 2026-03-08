package opps;

interface Honda {
    void start1();
}

interface Hero {
    void start2();
}

interface TVS {
    void start3();
}

interface KTM {
    void start4();
}

class InterfaceExample implements Honda,Hero,TVS,KTM {
	@Override
	public void start4() {
		System.out.println("KTM bike is racing bike");	
	}

	@Override
	public void start3() {
		System.out.println("TVS bike a normal bike");
	}

	@Override
	public void start2() {
		System.out.println("Hero bike most popular in Average");	
	}

	@Override
	public void start1() {
		System.out.println("good qulity bike");
	}
		
	
 public static void main(String []args) {
	 
	 InterfaceExample nn = new InterfaceExample();
	 nn.start1();
	 nn.start2();
	 nn.start3();
	 nn.start4();
 }
}
