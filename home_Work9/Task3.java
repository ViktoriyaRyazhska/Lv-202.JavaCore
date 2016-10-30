package home_Work9;

public class Task3 {

	public static void main(String[] args)  {
		Runnable r2 = new One();

		Thread t2 = new Thread(r2);
		t2.start();
		
		

		Runnable r3 = new Three();
		Thread t3 = new Thread(r3);
		t3.start();

	}

}

class One implements Runnable {

	@Override
	public void run() {
		Runnable r1 = new Two();

		Thread t1 = new Thread(r1);

		t1.start();

	}

}

class Two implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("Thread number two");
		}
	}

}

class Three implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Thread number three");
		}
	}

}