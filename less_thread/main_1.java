package thread_1;

public class main_1 {
	public static void main(String[] args) throws InterruptedException {
		
	Thread pot1 = new My_thread_1(1, "potok1", 75);
	Thread pot2 = new My_thread_1(2, "potok2", 100);
	Thread pot3 = new My_thread_1(3, "potok3", 50);
	pot1.start();
	pot2.start();
	pot1.join();
	pot2.join();
	pot3.start();
	}
}
