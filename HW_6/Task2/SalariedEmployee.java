
public class SalariedEmployee extends Employee implements calc {

	@Override
	public String toString() {
		return "SalariedEmployee [name=" + name + ", fixedpaid=" + fixedpaid + ", monthlypayment=" + monthlypayment
				+ ", socialSecurityNumber=" + socialSecurityNumber + "]";
	}

	String name;
	private double fixedpaid;
	private double monthlypayment;
	String socialSecurityNumber;
	

	public SalariedEmployee(String employeeid, String name, double monthlypayment, String socialSecurityNumber) {
		super(employeeid);
		this.name = name;
		this.monthlypayment = monthlypayment;
		this.socialSecurityNumber = socialSecurityNumber;
	}

	

	@Override
	public double calculatePay() {
		fixedpaid = monthlypayment;
		return fixedpaid;
	}

	public double getFixedpaid() {
		return fixedpaid;
	}

	public void setFixedpaid(double fixedpaid) {
		this.fixedpaid = fixedpaid;
	}

	public double getMonthlypayment() {
		return monthlypayment;
	}

	public void setMonthlypayment(double monthlypayment) {
		this.monthlypayment = monthlypayment;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

}
