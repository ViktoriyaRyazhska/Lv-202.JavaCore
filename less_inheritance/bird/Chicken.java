package less_Inheritance_01;

public class Chicken extends NonFlyingBird{
	private String name;


	public Chicken(boolean feahers, boolean layEggs, String name) {
		super(feahers, layEggs);
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Chicken [name=" + name + "]";
	}
	
	
}
