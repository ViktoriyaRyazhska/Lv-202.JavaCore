package softserve.com.newthread;

public class Application {
	public static void main(String[] args) {
		Runnable r = new One();
		Thread one = new Thread(r);
		one.start();
	}
}
