package softserve.com.employee;

public class SalariedEmployee extends AbstractEmployee implements Employee {

	private int hourlyRate ;
	private int numberOfHoursWorked;
	
	private String socialSecurityNumber ;

	public SalariedEmployee(int hourlyRate, int numberOfHoursWorked, String employeeID, String name) {
		super(employeeID, name);
		this.hourlyRate = hourlyRate;
		this.numberOfHoursWorked = numberOfHoursWorked;
	}

	public String getFederalTaxIdmember() {
		return socialSecurityNumber ;
	}

	public void setFederalTaxIdmember(String socialSecurityNumber ) {
		this.socialSecurityNumber  = socialSecurityNumber ;
	}

	public int getHour() {
		return hourlyRate;
	}

	public void setHour(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public int getSalary() {
		return numberOfHoursWorked;
	}

	public void setSalary(int numberOfHoursWorked) {
		this.numberOfHoursWorked = numberOfHoursWorked;
	}

	@Override
	public int calculatePay() {
		return hourlyRate*numberOfHoursWorked;
	}

	@Override
	public String toString() {
		return "SalariedEmployee [hourlyRate=" + hourlyRate + ", numberOfHoursWorked=" + numberOfHoursWorked
				+ ", calculatePay()=" + calculatePay() + ", getEmployeeld()=" + getEmployeeld() + ", getName()="
				+ getName() + "]";
	}
	
	

}
