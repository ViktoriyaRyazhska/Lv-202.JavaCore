package Home_Work5.task2;

public class SalariedEmployee extends Employee implements Payable {
	private String name;

	private String socialSecurityNumber;

	private double hourlyRate;

	private int hours;
	

	public SalariedEmployee() {
		super();
	}

	public SalariedEmployee(String employeeId, String name,String socialSecurityNumber, double hourlyRate, int hours) {
		super(employeeId);
		this.name = name;
		this.socialSecurityNumber = socialSecurityNumber;
		this.hourlyRate = hourlyRate;
		this.hours = hours;
	
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	@Override
	public double calculatePay() {
		return hourlyRate*hours;
	}

	@Override
	public String toString() {
		return "SalariedEmployee [name=" + name + ", salary=" + calculatePay() + ", employeeId=" + employeeId + "]";
	}
	
	

}
