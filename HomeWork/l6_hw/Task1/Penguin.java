package Task1;

/**
 * Created by Babajko on 14.10.2016.
 */
public class Penguin extends NonFlyingBird {
    public Penguin(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.print("Penguin. ");
    }
}
