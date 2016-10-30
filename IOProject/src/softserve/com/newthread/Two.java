package softserve.com.newthread;

public class Two extends Thread {
	Runnable r = new Three();
	Thread t = new Thread(r);

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("Thread number two");
		}
		t.start();
	}
}
