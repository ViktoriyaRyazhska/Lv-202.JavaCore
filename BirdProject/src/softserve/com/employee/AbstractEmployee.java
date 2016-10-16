package softserve.com.employee;

public abstract class AbstractEmployee {
	private String employeeld;
	private String name;
	
	public AbstractEmployee(String employeeld, String name) {
		this.employeeld = employeeld;
		this.name = name;
	}

	public String getEmployeeld() {
		return employeeld;
	}

	public void setEmployeeld(String employeeld) {
		this.employeeld = employeeld;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
