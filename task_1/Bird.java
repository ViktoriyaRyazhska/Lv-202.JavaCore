package task_1;

public abstract class Bird {
	
	private String feathers;
	private String ayEggs;

	public Bird(String feathers, String ayEggs) {
		
		this.feathers = feathers;
		this.ayEggs = ayEggs;
	}

	public String getFeathers() {
		return feathers;
	}

	public void setFeathers(String feathers) {
		this.feathers = feathers;
	}

	public String getAyEggs() {
		return ayEggs;
	}

	public void setAyEggs(String ayEggs) {
		this.ayEggs = ayEggs;
	}
	
	public abstract void fly();

}
