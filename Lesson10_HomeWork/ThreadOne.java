package Lesson10.HomeWork;

public class ThreadOne extends Thread {

	@Override
	public void run() {
		Thread threadTwo = new ThreadTwo();
		threadTwo.start();
	}

}
