package Home_Work5.task1;

public class Swallow extends FlyingBird {
	private String kindOfSwallow;

	public Swallow() {
		super();
	}

	public Swallow(String feathers, String layEggs, double maxSpeedOfFly, String kindOfSwallow) {
		super(feathers, layEggs, maxSpeedOfFly);
		this.kindOfSwallow = kindOfSwallow;
		
	}

	public String getKindOfSwallow() {
		return kindOfSwallow;
	}

	public void setKindOfSwallow(String kindOfSwallow) {
		this.kindOfSwallow = kindOfSwallow;
	}

	@Override
	public String toString() {
		return "Swallow [kindOfSwallow=" + kindOfSwallow + ", maxSpeedOfFly=" + maxSpeedOfFly + ", feathers=" + feathers
				+ ", layEggs=" + layEggs + "]";
	}
	
	

}
