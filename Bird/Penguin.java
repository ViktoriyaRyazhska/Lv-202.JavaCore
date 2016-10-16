package Lesson6.HomeWork.Bird;

public class Penguin extends NonFlyingBird {

	boolean layEggs = true;
	
	public Penguin() {
		super();
	}

	@Override
	public void fly() {
		super.fly();
		System.out.println("I am penguina, I cant fly, I am useless");
	}

	@Override
	public String toString() {
		return "Penguin [feathers=" + feathers + ", layEggs=" + layEggs + "]";
	}

}
