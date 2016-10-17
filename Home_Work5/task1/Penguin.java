package Home_Work5.task1;

public class Penguin extends NonFlyingBird {
	public Penguin(){
		super();
	}

	public Penguin(String feathers, String layEggs, double maxSpeedOfWalk) {
		super(feathers, layEggs, maxSpeedOfWalk);
	}
	
	@Override
	public void fly() {
		System.out.println("I can't fly, but I can swim!");
	}

	@Override
	public String toString() {
		return "Penguin [maxSpeedOfWalk=" + maxSpeedOfWalk + ", feathers=" + feathers + ", layEggs=" + layEggs + "]";
	}
	
	
}
