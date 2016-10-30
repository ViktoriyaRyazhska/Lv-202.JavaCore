/**
 * Created by Babajko on 29.10.2016.
 */
public class Task3 {
    public static void main(String[] args) {
        Thread tr1 = new One();

        System.out.println("Start threads");
        tr1.start();
    }
}

class One extends Thread {
    @Override
    public void run(){
        Thread tr2 = new Two();
        tr2.start();
    }
}
class Two extends Thread {
    @Override
    public void run(){
        for (int i = 0; i < 3; i++) {
            System.out.println("Thread number two");
        }
        Thread tr3 = new Three();
        tr3.start();
    }
}
class Three extends Thread {
    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread number three");
        }

    }
}
