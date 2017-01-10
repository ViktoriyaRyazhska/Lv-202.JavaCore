package task_1;

public abstract class FlyingBird extends Bird {
	
	private double maxHeightFly;

	public FlyingBird(String feathers, String ayEggs, double maxHeightFly) {
		super(feathers, ayEggs);
		this.maxHeightFly = maxHeightFly;
	}

	public double getMaxHeightFly() {
		return maxHeightFly;
	}

	public void setMaxHeightFly(double maxHeightFly) {
		this.maxHeightFly = maxHeightFly;
	}

	@Override
	public void fly() {
		
		System.out.println("I can height fly ");
		
	}



	
	
	

}
