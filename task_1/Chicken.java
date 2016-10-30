package task_1;

public class Chicken extends NotFlyingBird{

	public Chicken(String feathers, String ayEggs, double maxSpeed) {
		super(feathers, ayEggs, maxSpeed);
		
	}

	@Override
	public void fly() {
		System.out.println("I am Chicken and I don't FLY");
	}

	@Override
	public String toString() {
		return "Chicken [getMaxSpeed()=" + getMaxSpeed() + ", getFeathers()=" + getFeathers() + ", getAyEggs()="
				+ getAyEggs() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	

}
