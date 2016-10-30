package Lesson10.HomeWork;

/*
 * Run three threads and output there different messages for 5 times.
 *  The third thread supposed to start after finishing working of the two previous threads.

 */
public class Thread1 extends Thread {

	@Override
	public void run() {
		synchronized (this) {
			System.out.println("This is FIRST thread");

		}
	}

}
