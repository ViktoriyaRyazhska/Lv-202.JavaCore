
public  class NonFlyingBirds extends Bird {
	public boolean feathers;
	public boolean layEggs; 
	

	@Override
	public String toString() {
		return "NonFlyingBirds [feathers=" + feathers + ", layEggs=" + layEggs + "]";
	}


	public NonFlyingBirds(boolean feathers, boolean layEggs) {
		super();
		this.feathers = feathers;
		this.layEggs = layEggs;
	}


	public boolean isFeathers() {
		return feathers;
	}


	public void setFeathers(boolean feathers) {
		this.feathers = feathers;
	}


	public boolean isLayEggs() {
		return layEggs;
	}


	public void setLayEggs(boolean layEggs) {
		this.layEggs = layEggs;
	}


	@Override
	public void fly() {
		System.out.println("I can't fly ;( ");
		
	}

}
