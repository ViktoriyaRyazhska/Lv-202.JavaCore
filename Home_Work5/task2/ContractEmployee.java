package Home_Work5.task2;

public class ContractEmployee extends Employee implements Payable {
	private String name;
	
	private String federalTaxIdmember;
	
	private double salary;
	
	public ContractEmployee() {
		super();
	}
	
	public ContractEmployee(String employeeId,String name ,String federalTaxIdmember, double salary) {
		super(employeeId);
		this.name= name;
		this.federalTaxIdmember = federalTaxIdmember;
		this.salary = salary;
		
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFederalTaxIdmember() {
		return federalTaxIdmember;
	}

	public void setFederalTaxIdmember(String federalTaxIdmember) {
		this.federalTaxIdmember = federalTaxIdmember;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public double calculatePay() {
		// TODO Auto-generated method stub
		return salary;
	}

	@Override
	public String toString() {
		return "ContractEmployee [name=" + name + ", salary=" + salary + ", employeeId=" + employeeId + "]";
	}
	
	
}
