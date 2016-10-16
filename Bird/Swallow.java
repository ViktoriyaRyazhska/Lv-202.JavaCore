package Lesson6.HomeWork.Bird;

public class Swallow extends FlyingBird {

	boolean layEggs = true;

	public Swallow() {
		super();
	}

	@Override
	public void fly() {
		super.fly();
		System.out.println("I am swallow, I dont know what am I");
	}

	@Override
	public String toString() {
		return "Swallow [feathers=" + feathers + ", layEggs=" + layEggs + "]";
	}

}
