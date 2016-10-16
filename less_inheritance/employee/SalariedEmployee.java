package less_Inheritance_02;

public class SalariedEmployee extends Employee implements calculate{
	private int price_hour;
	private int work_hour;
	private int average_monthly_salary;
	private String socialSecurityNumber;
	public SalariedEmployee(String name, String socialSecurityNumber, int average_monthly_salary) {
		super(name);
		this.socialSecurityNumber=socialSecurityNumber;
		this.average_monthly_salary= average_monthly_salary;
	}
	
	@Override
	public int calculatePay() {
		average_monthly_salary=price_hour*work_hour;
		return average_monthly_salary;
		}
	
	
	
	public void setAverage_monthly_salary(int average_monthly_salary) {
		this.average_monthly_salary = average_monthly_salary;
	}

	public int getAverage_monthly_salary() {
		return average_monthly_salary;
	}

	public int getPrice_hour() {
		return price_hour;
	}

	public void setPrice_hour(int price_hour) {
		this.price_hour = price_hour;
	}

	public int getWork_hour() {
		return work_hour;
	}

	public void setWork_hour(int work_hour) {
		this.work_hour = work_hour;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	@Override
	public String toString() {
		return "SalariedEmployee ["+ getName() + "  price_hour=" + price_hour + ", work_hour=" + work_hour + ", average_monthly_salary="
				+ average_monthly_salary + ", socialSecurityNumber=" + socialSecurityNumber + "]";
	}
	




		
	
	

}
