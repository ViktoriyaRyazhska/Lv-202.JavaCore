package task_1;

public class Pinguin extends NotFlyingBird{

	public Pinguin(String feathers, String ayEggs, double maxSpeed) {
		super(feathers, ayEggs, maxSpeed);
	
	}

	@Override
	public void fly() {
		System.out.println("I am Pinguin and I don't FLY");
	}

	@Override
	public String toString() {
		return "Pinguin [getMaxSpeed()=" + getMaxSpeed() + ", getFeathers()=" + getFeathers() + ", getAyEggs()="
				+ getAyEggs() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	

}
