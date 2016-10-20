
public abstract class Bird {
	@Override
	public String toString() {
		return "Bird [feathers=" + feathers + ", layEggs=" + layEggs + "]";
	}

	protected String feathers;
	protected String layEggs;
	
	
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
