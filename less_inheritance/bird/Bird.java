package less_Inheritance_01;

public abstract class Bird {
	private boolean feahers;
	private boolean layEggs;
	
	public Bird(boolean feahers, boolean layEggs) {
		this.feahers = feahers;
		this.layEggs = layEggs;
	}

	public abstract void fly();

	public boolean getFeahers() {
		return feahers;
	}

	public void setFeahers(boolean feahers) {
		this.feahers = feahers;
	}

	public boolean getLayEggs() {
		return layEggs;
	}

	public void setLayEggs(boolean layEggs) {
		this.layEggs = layEggs;
	}

	public void printBird(){
		System.out.print("feahers=" + feahers + ", layEggs=" + layEggs);
	}
}
