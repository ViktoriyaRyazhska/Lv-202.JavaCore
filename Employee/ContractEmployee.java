package Lesson6.HomeWork.Employee;

public class ContractEmployee extends Employee implements Payable {

	private String name;

	private double fixedPaid;

	private String federalTaxIdmember;

	public ContractEmployee(String name, double fixedPaid, String federalTaxIdmember) {
		super();
		this.name = name;
		this.fixedPaid = fixedPaid;
		this.federalTaxIdmember = federalTaxIdmember;
	}

	public String getName() {
		return name;
	}

	public double getFixedPaid() {
		return fixedPaid;
	}

	public String getFederalTaxIdmember() {
		return federalTaxIdmember;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setFixedPaid(double fixedPaid) {
		this.fixedPaid = fixedPaid;
	}

	public void setFederalTaxIdmember(String federalTaxIdmember) {
		this.federalTaxIdmember = federalTaxIdmember;
	}

	// For employees with a fixed payment the formula is:
	// "the average monthly salary = fixed monthly payment“
	@Override
	public double calculatePay() {
		double averageMonthlySalary = fixedPaid;
		return averageMonthlySalary;
	}

	@Override
	public String toString() {
		return "ContractEmployee { FederalTaxIdmember -> " + federalTaxIdmember + " name -> " + name + " payment -> "
				+ calculatePay() + "}";
	}

	public void outputting() {
		System.out.println("FederalTaxIdmember -> " + getFederalTaxIdmember() + " name -> " + getName() + " payment -> "
				+ calculatePay());
	}

}
