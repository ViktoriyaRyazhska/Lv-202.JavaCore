interface AverageMonthlyWage {
	int calculatePay();
}

abstract class Employee{
	private static int count = 0;
	private int employeeId;
	private String name;

	public Employee(String name) {
		count++;
		this.name = name;
		this.employeeId = count;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	abstract public int calculatePay();

}

class SalariedEmployee extends Employee implements AverageMonthlyWage {

	private String socialSecurityNumber;
	private int fixedMonthlyPayment;

	public SalariedEmployee(String name, String socialSecurityNumber, int fixedMonthlyPayment) {
		super(name);
		this.socialSecurityNumber = socialSecurityNumber;
		this.fixedMonthlyPayment = fixedMonthlyPayment;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public int getFixedMonthlyPayment() {
		return fixedMonthlyPayment;
	}

	public void setFixedMonthlyPayment(int fixedMonthlyPayment) {
		this.fixedMonthlyPayment = fixedMonthlyPayment;
	}

	public int calculatePay() {
		return fixedMonthlyPayment;
	}

}

class ContractEmployee extends Employee implements AverageMonthlyWage {
	private String federalTaxIdmember;
	private int hourlyRate;
	private int numberOfHoursWorked;

	public ContractEmployee(String name, String federalTaxIdmember, int hourlyRate, int numberOfHoursWorked) {
		super(name);
		this.federalTaxIdmember = federalTaxIdmember;
		this.hourlyRate = hourlyRate;
		this.numberOfHoursWorked = numberOfHoursWorked;
	}

	public String getFederalTaxIdmember() {
		return federalTaxIdmember;
	}

	public void setFederalTaxIdmember(String federalTaxIdmember) {
		this.federalTaxIdmember = federalTaxIdmember;
	}

	public int getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public int getNumberOfHoursWorked() {
		return numberOfHoursWorked;
	}

	public void setNumberOfHoursWorked(int numberOfHoursWorked) {
		this.numberOfHoursWorked = numberOfHoursWorked;
	}

	public int calculatePay() {
		return hourlyRate * numberOfHoursWorked;
	}

}

public class Task2 {

	public static void main(String[] args) {
		Employee[] employees = { new SalariedEmployee("Sasha", "65783658", 100_000),
				new ContractEmployee("Mykola", "486584356", 500, 160),
				new SalariedEmployee("Petro", "345353455", 85_000),
				new ContractEmployee("Olya", "8746583465", 750, 80), };
		Employee tmp;
		for (int i = 0; i < employees.length - 1; i++) {
			for (int j = i + 1; j < employees.length; j++)
				if (employees[i].calculatePay() < employees[j].calculatePay()) {
					tmp = employees[i];
					employees[i] = employees[j];
					employees[j] = tmp;
				}
		}
		for (int i=0; i<employees.length;i++)
			System.out.println(employees[i].getEmployeeId()+"\t"+employees[i].getName()+"\t"+ employees[i].calculatePay());
	}

}
