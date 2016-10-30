package Lesson10.HomeWork;

/*thread «two», which has to output its number («Thread number two») 3 times and create thread «three»*/
public class ThreadTwo extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 3; i++) {
			System.out.println("Thread number two");
			Thread threadThree = new ThreadThree();
			threadThree.start();
		}

	}

}
