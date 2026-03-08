package javaNew8;

public class RunnableThread {

	public static void main(String[] args) {
		        // Task 1
		        Runnable task1 = () -> {
		            for (int i = 1; i <= 5; i++) {
		                System.out.println("Task 1 - Count: " + i);
		                try {
		                    Thread.sleep(500); // pause 0.5 sec
		                } catch (InterruptedException e) {
		                    e.printStackTrace();
		                }
		            }
		        };

		        // Task 2
		        Runnable task2 = () -> {
		            for (int i = 1; i <= 5; i++) {
		                System.out.println("Task 2 - Count: " + i);
		                try {
		                    Thread.sleep(500);
		                } catch (InterruptedException e) {
		                    e.printStackTrace();
		                }
		            }
		        };

		        Thread t1 = new Thread(task1);
		        Thread t2 = new Thread(task2);

		        t1.start();
		        t2.start();


	}

}
