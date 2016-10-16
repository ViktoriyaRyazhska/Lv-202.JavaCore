abstract class Bird {
	private String feathers;
	private String layEggs;

	public Bird(String feathers, String layEggs) {
		this.feathers = feathers;
		this.layEggs = layEggs;
	}

	public String getFeathers() {
		return feathers;
	}

	public void setFeathers(String feathers) {
		this.feathers = feathers;
	}

	public String getLayEggs() {
		return layEggs;
	}

	public void setLayEggs(String layEggs) {
		this.layEggs = layEggs;
	}

	abstract public void fly();

	public String toString() {
		return getFeathers() + "; " + getLayEggs();
	}
}

abstract class FlyingBird extends Bird {

	public FlyingBird(String feathers, String layEggs) {
		super(feathers, layEggs);
	}

	public void fly() {
		System.out.println("I can fly!!!");
	}

}

abstract class NonFlyingBird extends Bird {

	public NonFlyingBird(String feathers, String layEggs) {
		super(feathers, layEggs);
	}

	public void fly() {
		System.out.println("I can't fly!!!");
	}

}

class Eagle extends FlyingBird {

	public Eagle(String feathers, String layEggs) {
		super(feathers, layEggs);
	}

}

class Swallow extends FlyingBird {

	public Swallow(String feathers, String layEggs) {
		super(feathers, layEggs);
	}

}

class Penguin extends NonFlyingBird {

	public Penguin(String feathers, String layEggs) {
		super(feathers, layEggs);
	}

}

class Chicken extends NonFlyingBird {

	public Chicken(String feathers, String layEggs) {
		super(feathers, layEggs);
	}

}

public class Task1 {

	public static void main(String[] args) {
		Bird[] birds = { new Eagle("Feathers of Eagle", "Eagle lays eggs"),
				new Swallow("Feathers of Swallow", "Swallow lays eggs"),
				new Penguin("Feathers of Penguin", "Penguin lays eggs"),
				new Chicken("Feathers of Chicken", "Chicken lays eggs") };
		for (Bird bird : birds) {
			bird.fly();
		}
		for (Bird bird : birds) {
			System.out.println(bird.toString());
		}
	}

}
