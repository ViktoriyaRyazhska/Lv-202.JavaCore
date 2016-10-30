package Lesson10.HomeWork;

public class ThreadThree extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Thread number three");
		}
	}

}
