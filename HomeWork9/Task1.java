class MyThread extends Thread{
	private int num;
	public MyThread(int num){
		this.num = num;
	}
	public void run(){
		for (int i=0; i<5;i++)
		System.out.println("Thread "+ num);
	}
}
public class Task1 {

	public static void main(String[] args) {
		MyThread th1 = new MyThread(1);
		MyThread th2 = new MyThread(2);
		MyThread th3 = new MyThread(3);
		th1.start();
		th2.start();
		try {
			th1.join();
			th2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		th3.start();

	}

}
