package Home_Work5.task1;

public class FlyingBird extends Bird {
	
	protected double maxSpeedOfFly;

	public FlyingBird() {
		super();
	}

	public FlyingBird(String feathers, String layEggs, double maxSpeedOfFly) {
		super(feathers, layEggs);
		this.maxSpeedOfFly = maxSpeedOfFly;
	
	}
	
	
	
	public double getMaxSpeedOfFly() {
		return maxSpeedOfFly;
	}

	public void setMaxSpeedOfFly(double maxSpeedOfFly) {
		this.maxSpeedOfFly = maxSpeedOfFly;
	}

	@Override
	public void fly() {
		System.out.println("I can fly!");
	}

}
