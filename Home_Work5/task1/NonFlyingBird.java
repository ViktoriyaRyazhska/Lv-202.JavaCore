package Home_Work5.task1;

public class NonFlyingBird extends Bird {
	
	protected double maxSpeedOfWalk;

	public NonFlyingBird() {
		super();
	}
	
	public NonFlyingBird(String feathers, String layEggs, double maxSpeedOfWalk) {
		super(feathers, layEggs);
		this.maxSpeedOfWalk = maxSpeedOfWalk;
	}

	public double getMaxSpeedOfWalk() {
		return maxSpeedOfWalk;
	}

	public void setMaxSpeedOfWalk(double maxSpeedOfWalk) {
		this.maxSpeedOfWalk = maxSpeedOfWalk;
	}

	@Override
	public void fly() {
		System.out.println("I can't fly(((");

	}

}
