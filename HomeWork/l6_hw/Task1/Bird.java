package Task1;

/**
 * Created by Babajko on 14.10.2016.
 */
public abstract class Bird {
    private boolean feathers;
    private boolean layEggs;

    public Bird(boolean feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public abstract void fly();

    public void printInfo(){
        if(isFeathers()) System.out.print("I am feathers. "); else System.out.print("I am not feathers. ");
        if(isLayEggs()) System.out.print("I do lay eggs. "); else System.out.print("I don`t lay eggs. ");
        System.out.print("I bird ");
    }

    public boolean isFeathers() {
        return feathers;
    }

    public boolean isLayEggs() {
        return layEggs;
    }
}
