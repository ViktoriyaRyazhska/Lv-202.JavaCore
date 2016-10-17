package task_1;

public class Eagle extends FlyingBird{
	
	private String name;

	public Eagle(String feathers, String ayEggs, double maxHeightFly, String name) {
		super(feathers, ayEggs, maxHeightFly);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void fly() {
		System.out.println("I can fly very height");
	}

	@Override
	public String toString() {
		return "Eagle [name=" + name + "]";
	}
	
	

}
