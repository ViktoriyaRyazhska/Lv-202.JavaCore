package thread_1;

public class My_thread_1 extends Thread {
	private int number;
	private String str;
	private int sec;
	
	public My_thread_1( int number, String str, int sec) {
		this.str = str;
		this.number=number;
		this.sec=sec;
	}

	@Override
	public void run() {
	for (int i = 0; i < 5; i++) {
		System.out.println("potok "+ number + " : "+str);
		try {
			sleep(sec);
		} catch (InterruptedException e) {
		e.printStackTrace();
		}}
	}
	
}
