package Home_Work5.task1;

public class Eagle extends FlyingBird {
	private String kindOfEagle;

	public Eagle() {
		super();
	}

	public Eagle(String feathers, String layEggs, double maxSpeedOfFly, String kindOfEagle) {
		super(feathers, layEggs, maxSpeedOfFly);
		this.kindOfEagle = kindOfEagle;
	}

	public String getKindOfEagle() {
		return kindOfEagle;
	}

	public void setKindOfEagle(String kindOfEagle) {
		this.kindOfEagle = kindOfEagle;
	}
	
	@Override
	public void fly() {
		System.out.println("I can fly very fast!");
	}

	@Override
	public String toString() {
		return "Eagle [kindOfEagle=" + kindOfEagle + ", maxSpeedOfFly=" + maxSpeedOfFly + ", feathers=" + feathers
				+ ", layEggs=" + layEggs + "]";
	}
	
	
}
