package task_1;

public class NotFlyingBird extends Bird{
	
	private double maxSpeed;

	public NotFlyingBird(String feathers, String ayEggs, double maxSpeed) {
		super(feathers, ayEggs);
		this.maxSpeed = maxSpeed;
	}

	public double getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	@Override
	public void fly() {
		System.out.println("I don't FLY");
		
	}
	
	

}
