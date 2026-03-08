	package task;

public class taskname extends Thread {
	public void run() {
		try {
			while(true) {
				System.out.println("mandar");
			Thread.sleep(2000);}
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}

	public static void main(String[] args) {
		
		taskname t = new taskname ();
		t.start();
	
		// TODO Auto-generated method stub
		

	}

}
