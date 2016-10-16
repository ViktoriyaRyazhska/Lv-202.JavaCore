package softserve.com.employee;

public class Application {
	public static void main(String[] args) {
		Employee[] employees = new Employee[4];
		employees[0] = new ContractEmployee(400, "12x", "Olena");
		employees[1] = new ContractEmployee(500,"13z","Ivan");
		employees[2] = new SalariedEmployee(8, 8,"14e","Nadia");
		employees[3] = new SalariedEmployee(12, 8,"15s","Nazar");
		
		for (int i = 0; i < employees.length; i++) {
			System.out.println(employees[i]);
		}
	}
}
