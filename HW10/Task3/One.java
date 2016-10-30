
public class One extends Thread {
	@Override
	public void run() {
		Thread t2 = new Two();
		t2.start();
	}
}
