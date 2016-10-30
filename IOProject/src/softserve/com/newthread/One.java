package softserve.com.newthread;

public class One extends Thread{
	Runnable r = new Two();
	Thread t = new Thread(r);
	@Override
	public void run() {
		t.start();
	}
}
