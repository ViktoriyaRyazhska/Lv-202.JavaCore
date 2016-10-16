package Task1;

/**
 * Created by Babajko on 14.10.2016.
 */
public class FlyingBird extends Bird {
    public FlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("I fly.");
    }
}
