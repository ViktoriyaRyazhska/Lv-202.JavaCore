package Task1;

/**
 * Created by Babajko on 14.10.2016.
 */
public class NonFlyingBird extends Bird {
    public NonFlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("I don't fly.");
    }
}
