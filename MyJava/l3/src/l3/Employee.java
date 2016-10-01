package l3;

public class Employee {
	private String name;
	private float rate;
	private int hour;
	
	private static float totalSum;
	

	public Employee() {
	}
	
	public Employee(String name, float rate) {
		super();
		this.name = name;
		this.rate = rate;
	}

	public Employee(String name, float rate, int hour) {
		super();
		this.name = name;
		this.rate = rate;
		this.hour = hour;
		totalSum += this.rate * this.hour;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public float getRate() {
		return rate;
	}

	public void setRate(float rate) {
		totalSum -= this.rate * this.hour;
		this.rate = rate;
		totalSum += this.rate * this.hour;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		totalSum -= this.rate * this.hour;
		this.hour = hour;
		totalSum += this.rate * this.hour;
	}
		
	public static float getTotalSum() {
		return totalSum;
	}

	public float salary (){
		
		return this.rate * this.hour;
	}
	
	public void changeRate (float rate){
		totalSum -= this.rate * this.hour;
		this.rate = rate;
		totalSum += this.rate * this.hour;
	}
	
	public float bonuses (){
		return (0.1f*salary());
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", rate=" + rate + ", hour=" + hour +   ", bonus=" + bonuses() +  "]";
	}
	

}
