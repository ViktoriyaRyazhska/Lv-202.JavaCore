package Lesson10.HomeWork;

/*
 * Run three threads and output there different messages for 5 times.
 *  The third thread supposed to start after finishing working of the two previous threads.

 */
public class Thread3 extends Thread {

	@Override
	public void run() {

		for (int i = 0; i <= 2; i++) {
			System.out.println("This is THIRD thread");

		}

	}

}
