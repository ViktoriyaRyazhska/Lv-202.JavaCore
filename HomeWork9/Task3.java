class Thread1 extends Thread{
	public void run(){
		Thread2 th2 = new Thread2();
		th2.start();	
	}
}
class Thread2 extends Thread{
	public void run(){
		for (int i=0; i<3;i++)
		System.out.println("Thread number two");
		Thread3 th3 = new Thread3();
		th3.start();
	}
}
class Thread3 extends Thread{
	public void run(){
		for (int i=0; i<5;i++)
		System.out.println("Thread number three");
	}
}

public class Task3 {

	public static void main(String[] args) {
	Thread1 th1 = new Thread1();
	th1.start();

	}

}
