package Task1;

/**
 * Created by Babajko on 14.10.2016.
 */
public class Swallow extends FlyingBird {
    public Swallow(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.print("Swallow. ");
    }
}
