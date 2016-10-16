package less_Inheritance_02;

public class ContractEmployee extends Employee implements calculate {
	private String federalTaxIdmember ;
	private int average_monthly_salary;
	private int fixed_monthly_salary;
	public ContractEmployee(String name, String federalTaxIdmember, int average_monthly_salary) {
		super(name);
		this.federalTaxIdmember=federalTaxIdmember;
		this.average_monthly_salary= average_monthly_salary;
	}
	
	public int getAverage_monthly_salary() {
		return average_monthly_salary;
	}

	public void setAverage_monthly_salary(int average_monthly_salary) {
		this.average_monthly_salary = average_monthly_salary;
	}

	@Override
	public int calculatePay() {
		average_monthly_salary=fixed_monthly_salary;
		return average_monthly_salary;
	}

	public int getFixed_monthly_salary() {
		return fixed_monthly_salary;
	}

	public void setFixed_monthly_salary(int fixed_monthly_salary) {
		this.fixed_monthly_salary = fixed_monthly_salary;
	}

	public String getFederalTaxIdmember() {
		return federalTaxIdmember;
	}

	public void setFederalTaxIdmember(String federalTaxIdmember) {
		this.federalTaxIdmember = federalTaxIdmember;
	}

	@Override
	public String toString() {
		return "ContractEmployee ["+ getName() +"  federalTaxIdmember=" + federalTaxIdmember + ", average_monthly_salary="
				+ average_monthly_salary + "]";
	}




	
	
	
}
