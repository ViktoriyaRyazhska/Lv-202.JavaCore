package Task1;

/**
 * Created by Babajko on 14.10.2016.
 */
public class Task1 {
    public static void main(String[] args) {
        Bird [] birds = new Bird[4];

        birds[0] = new Eagle(true, false);
        birds[1] = new Swallow(false, false);
        birds[2] = new Penguin(true,true);
        birds[3] = new Chicken(false,true);

        for (Bird bird:birds) {
            bird.printInfo();
            bird.fly();
        }
    }
}
