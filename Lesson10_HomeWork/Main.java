package Lesson10.HomeWork;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		/*
		 * Run three threads and output there different messages for 5 times.
		 * The third thread supposed to start after finishing working of the two
		 * previous threads.
		 */
		Thread t1 = new Thread1();
		Thread t2 = new Thread2();
		Thread t3 = new Thread3();

		t1.start();
		t2.start();
		t2.join();
		t3.start();

		/*
		 * Create a thread «one», which would start the thread «two», which has
		 * to output its number («Thread number two») 3 times and create thread
		 * «three», which would to output message «Thread number three» 5 times.
		 */
		Thread threadOne = new ThreadOne();
		Thread threadTwo = new ThreadTwo();
		Thread threadThree = new ThreadThree();

		threadOne.start();
		threadTwo.start();
		threadThree.start();
	}

}
