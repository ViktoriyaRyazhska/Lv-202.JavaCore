/**
 * Created by Babajko on 29.10.2016.
 */
public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        Thread tr1 = new MyThread("Thread1");
        Thread tr2 = new MyThread("Thread2");
        Thread tr3 = new MyThread("Thread3");

        System.out.println("Start threads");
        tr1.start();
        tr2.start();
        tr2.join();
        tr3.start();
    }
}

class MyThread extends Thread {
    private String msg;

    public MyThread(String msg) {
        this.msg = msg;
    }

    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println(msg + " " + i);
        }
    }
}