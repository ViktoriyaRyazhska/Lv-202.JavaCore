package softserve.com.bird;

public abstract class Bird {
	private String feathers;
	private boolean layEggs;
	public String getFeathers() {
		return feathers;
	}
	public void setFeathers(String feathers) {
		this.feathers = feathers;
	}
	public boolean isLayEggs() {
		return layEggs;
	}
	public void setLayEggs(boolean layEggs) {
		this.layEggs = layEggs;
	}

	abstract public boolean fly();
}
