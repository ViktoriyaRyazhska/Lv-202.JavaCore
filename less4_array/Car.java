package java_04_loops_5;

public class Car {
	private int year;
	private int engine;
	
	public Car(int year, int engine) {
		this.year = year;
		this.engine = engine;
	}
	
	public Car() {
		}

	@Override
	public String toString() {
		return "Car [year=" + year + ", engine=" + engine + "]";
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getEngine() {
		return engine;
	}

	public void setEngine(int engine) {
		this.engine = engine;
	}
	
	
	
	

}
