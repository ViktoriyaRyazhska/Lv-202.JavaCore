package Lesson6.HomeWork.Bird;

public class Eagle extends FlyingBird {
	
	boolean layEggs = true;

	public Eagle() {
		super();
	}

	@Override
	public void fly() {
		super.fly();
		System.out.println("I am eagle, I wanna eat chicken");
	}

	@Override
	public String toString() {
		return "Eagle [feathers=" + feathers + ", layEggs=" + layEggs + "]";
	}

}
