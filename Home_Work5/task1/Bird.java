package Home_Work5.task1;

public abstract class Bird {
	
	protected String feathers;
	protected String layEggs;
	
	public Bird(){}

	public Bird(String feathers, String layEggs) {
		this.feathers = feathers;
		this.layEggs = layEggs;
	}

	public String getFeathers() {
		return feathers;
	}

	public void setFeathers(String feathers) {
		this.feathers = feathers;
	}

	public String getLayEggs() {
		return layEggs;
	}

	public void setLayEggs(String layEggs) {
		this.layEggs = layEggs;
	}
	
	public abstract void fly();
	
	
	
	
	
}
