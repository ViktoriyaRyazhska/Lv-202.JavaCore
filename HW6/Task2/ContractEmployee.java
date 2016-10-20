
public class ContractEmployee extends Employee implements calc {
	String name;
	private double hourlypaid;
	double rate;
	int hours;
	String federalTaxIdmember;

	public ContractEmployee(String employeeid, String name, double rate, int hours, String federalTaxIdmember) {
		super(employeeid);
		this.name = name;
		this.rate = rate;
		this.hours = hours;
		this.federalTaxIdmember = federalTaxIdmember;
	}

	public double getHourlypaid() {
		return hourlypaid;
	}

	public void setHourlypaid(double hourlypaid) {
		this.hourlypaid = hourlypaid;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public String getFederalTaxIdmember() {
		return federalTaxIdmember;
	}

	public void setFederalTaxIdmember(String federalTaxIdmember) {
		this.federalTaxIdmember = federalTaxIdmember;
	}

	@Override
	public double calculatePay() {
		hourlypaid = rate * hours;
		return hourlypaid;
	}

	@Override
	public String toString() {
		return "ContractEmployee [name=" + name + ", hourlypaid=" + hourlypaid + ", rate=" + rate + ", hours=" + hours
				+ ", federalTaxIdmember=" + federalTaxIdmember + "]";
	}
	

}
