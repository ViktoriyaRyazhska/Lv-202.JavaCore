package Home_Work5.task1;

public class Chicken extends NonFlyingBird {
	
	public Chicken(){
		super();
	}

	public Chicken(String feathers, String layEggs, double maxSpeedOfWalk) {
		super(feathers, layEggs, maxSpeedOfWalk);
		
	}

	@Override
	public String toString() {
		return "Chicken [maxSpeedOfWalk=" + maxSpeedOfWalk + ", feathers=" + feathers + ", layEggs=" + layEggs + "]";
	}


	
	
	

}
