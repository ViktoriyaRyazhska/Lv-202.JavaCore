package less_Inheritance_01;

public class NonFlyingBird extends Bird{
	
	public NonFlyingBird(boolean feahers, boolean layEggs) {
		super(feahers, layEggs);
	}

	@Override
	public void fly() {
		System.out.println("  Bird not fly");
		
	}
	

}
