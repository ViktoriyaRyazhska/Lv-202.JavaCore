package Lesson6.HomeWork.Bird;

public class Chicken extends NonFlyingBird {

	boolean layEggs = true;
	
	public Chicken() {
		super();
	}

	@Override
	public void fly() {
		super.fly();
		System.out.println("I am chicken, I scare of eagle, he wanna eat me");
	}

	@Override
	public String toString() {
		return "Chicken [feathers=" + feathers + ", layEggs=" + layEggs + "]";
	}

}
