package less_Inheritance_01;

public class FlyingBird extends Bird{


	public FlyingBird(boolean feahers, boolean layEggs) {
		super(feahers, layEggs);
		}

	@Override
	public void fly() {
		System.out.println("  Bird fly");
		
	}
	
}
