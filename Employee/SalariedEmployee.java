package Lesson6.HomeWork.Employee;

public class SalariedEmployee extends Employee implements Payable {

	private String name;

	private double hourlyPaid;

	private double numberOfHoursWorked;

	private String socialSecurityNumber;

	public SalariedEmployee(String name, double hourlyPaid, double numberOfHoursWorked, String socialSecurityNumber) {
		super();
		this.name = name;
		this.hourlyPaid = hourlyPaid;
		this.numberOfHoursWorked = numberOfHoursWorked;
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public String getName() {
		return name;
	}

	public double getHourlyPaid() {
		return hourlyPaid;
	}

	public double getNumberOfHoursWorked() {
		return numberOfHoursWorked;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHourlyPaid(double hourlyPaid) {
		this.hourlyPaid = hourlyPaid;
	}

	public void setNumberOfHoursWorked(double numberOfHoursWorked) {
		this.numberOfHoursWorked = numberOfHoursWorked;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	// The calculation formula for the "time-worker“ is:
	// "the average monthly salary = hourly rate * number of hours worked"
	@Override
	public double calculatePay() {
		double averageMonthlySalary = hourlyPaid * numberOfHoursWorked;
		return averageMonthlySalary;
	}

	@Override
	public String toString() {
		return "SalariedEmployee {SocialSecurityNumber ->" + socialSecurityNumber + " name -> " + name + " payment -> "
				+ calculatePay() + "}";
	}

	public void outputting() {
		System.out.println("SocialSecurityNumber ->" + getSocialSecurityNumber() + " name -> "
				+ getName() + " payment -> " + calculatePay());
	}

}
