package task_1;

public class Swallow  extends FlyingBird{
	
	private String name;

	public Swallow(String feathers, String ayEggs, double maxHeightFly, String name) {
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
		System.out.println("I can fly very Low ");
	}

	@Override
	public String toString() {
		return "Swallow [name=" + name + "]";
	}
	
	

}
