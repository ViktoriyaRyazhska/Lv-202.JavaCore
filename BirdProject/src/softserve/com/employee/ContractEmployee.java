package softserve.com.employee;

public class ContractEmployee extends AbstractEmployee implements Employee {

	private int salary;
	private String federalTaxIdmember;

	public ContractEmployee(int salary, String employeeId, String name) {
		super(employeeId, name);
		this.salary = salary;
	}

	public String getFederalTaxIdmember() {
		return federalTaxIdmember;
	}

	public void setFederalTaxIdmember(String federalTaxIdmember) {
		this.federalTaxIdmember = federalTaxIdmember;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public int calculatePay() {
		return salary;
	}

	@Override
	public String toString() {
		return "ContractEmployee [salary=" + salary + ", calculatePay()=" + calculatePay() + ", getEmployeeld()="
				+ getEmployeeld() + ", getName()=" + getName() + "]";
	}

}
