package softserve.com.thread;

public class Application {
	public static void main(String[] args) {
		Runnable r1 = new MyThread();
		Thread t1 = new Thread(r1);
		Runnable r2 = new MyThread2();
		Thread t2 = new Thread(r2);
		Runnable r3 = new MyThread3();
		Thread t3 = new Thread(r3);
		t1.start();
		t2.start();
		t3.start();
	}
}
