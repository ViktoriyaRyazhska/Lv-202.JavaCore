import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Class of creating new employees
 * 
 * @version 1.00 02 Nov 2016
 * @author Oleksandr Butyter
 *
 */
abstract class Employee implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	 * Counter of new employees
	 */
	private static int count = 1;
	/**
	 * Employee ID
	 */
	private int id;
	/**
	 * Employee name
	 */
	private String name;

	/**
	 * Constructor of creating a new employee
	 * 
	 * @param name
	 *            Name of a new employee
	 */
	public Employee(String name) {
		this.name = name;
		this.id = count;
		count++;
	}

	/**
	 * Method of getting a name of this employee
	 * 
	 * @return Returns a name of this employee
	 */
	public String getName() {
		return name;
	}

	/**
	 * Method of setting new name of this employee
	 * 
	 * @param name
	 *            New name of this employee
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Method of getting an ID of this employee
	 * 
	 * @return Returns an ID of this employee
	 */
	public int getId() {
		return id;
	}

	public String toString() {
		return "Employee [ID - " + id + ", Name - " + name + ", Salary - " + salary() + "]";
	}

	/**
	 * Method of getting a salary of an employee
	 * 
	 * @return Returns a salary of an employee
	 */
	abstract public double salary();
}

/**
 * Class of creating new employees with fixed payment
 * 
 * @version 1.00 02 Nov 2016
 * @author Oleksandr Butyter
 *
 */
class EmployeeFixedPayment extends Employee {

	private static final long serialVersionUID = 1L;
	/**
	 * Fixed payment of an employee
	 */
	private int fixedPayment;

	/**
	 * Constructor of creating a new employee with fixed payment
	 * 
	 * @param name
	 *            Name of a new employee with fixed payment
	 * 
	 * @param fixedPayment
	 *            Fixed payment of a new employee
	 */
	public EmployeeFixedPayment(String name, int fixedPayment) {
		super(name);
		this.fixedPayment = fixedPayment;
	}

	/**
	 * Method of getting fixed payment of an employee
	 * 
	 * @return Returns fixed payment of an employee
	 */
	public int getfixedPayment() {
		return fixedPayment;
	}

	/**
	 * Method of setting new fixed payment of this employee
	 * 
	 * @param fixedPayment
	 *            New fixed payment of this employee
	 */
	public void setfixedPayment(int fixedPayment) {
		this.fixedPayment = fixedPayment;
	}

	public double salary() {
		return fixedPayment;
	}
}

/**
 * Class of creating new employees with hourly rate
 * 
 * @version 1.00 02 Nov 2016
 * @author Oleksandr Butyter
 *
 */
class EmployeeHourlyWage extends Employee {

	private static final long serialVersionUID = 1L;
	/**
	 * Hourly rate of an employee
	 */
	private int hourlyRate;

	/**
	 * Constructor of creating a new employee with hourly rate
	 * 
	 * @param name
	 *            Name of a new employee with hourly rate
	 * @param hourlyRate
	 *            Hourly rate of a new employee
	 */
	public EmployeeHourlyWage(String name, int hourlyRate) {
		super(name);
		this.hourlyRate = hourlyRate;
	}

	/**
	 * Method of getting hourly rate of an employee
	 * 
	 * @return Returns hourly rate of an employee
	 */
	public int getHourlyRate() {
		return hourlyRate;
	}

	/**
	 * Method of setting new hourly rate of this employee
	 * 
	 * @param hourlyRate
	 *            New hourly rate of this employee
	 */
	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public double salary() {
		return hourlyRate * 20.8 * 8;
	}

}

/**
 * Class of creating a new department
 * 
 * @version 1.00 02 Nov 2016
 * @author Oleksandr Butyter
 *
 */
class Department {
	/**
	 * List of employees of a department
	 */
	private List<Employee> employees;

	/**
	 * Constructor of creating a new department
	 * 
	 * @param employees
	 *            List of employees of a new department
	 */
	public Department(List<Employee> employees) {
		this.employees = employees;
	}

	/**
	 * Method of getting list of employees of a department
	 * 
	 * @return Returns list of employees of a department
	 */
	public List<Employee> getEmployees() {
		return employees;
	}

	/**
	 * Method of setting new list of employees of this department
	 * 
	 * @param employees
	 *            New list of employees of this department
	 */
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	/**
	 * Method of adding a new employee to this department
	 */
	public void addEmployee() {
		Employee employee;
		int i = 1 + (int) (2 * Math.random());
		if (i == 1) {
			employee = new EmployeeFixedPayment("Name" + (employees.size() + 1), 50000 + (int) (Math.random() * 50001));
		} else {
			employee = new EmployeeHourlyWage("Name" + (employees.size() + 1), 500 + (int) (Math.random() * 501));
		}
		employees.add(employee);
	}

	/**
	 * Method of getting an employee who has the highest salary
	 * 
	 * @return Returns an employee who has the highest salary
	 */
	public Employee findEmployeeWithMaxSalary() {
		double max = employees.get(0).salary();
		int imax = 0;
		for (int i = 1; i < employees.size(); i++) {
			if (max < employees.get(i).salary()) {
				max = employees.get(i).salary();
				imax = i;
			}
		}
		return employees.get(imax);
	}

	/**
	 * Method of getting an employee who has the lowest salary
	 * 
	 * @return Returns an employee who has the lowest salary
	 */
	public Employee findEmployeeWithMinSalary() {
		double min = employees.get(0).salary();
		int imin = 0;
		for (int i = 1; i < employees.size(); i++) {
			if (min > employees.get(i).salary()) {
				min = employees.get(i).salary();
				imin = i;
			}
		}
		return employees.get(imin);
	}

	/**
	 * Method of sorting list of employees by name (ascending)
	 */
	public void sortEmployeesByNameAsc() {
		employees.sort(new Comparator<Employee>() {
			public int compare(Employee e1, Employee e2) {
				return e1.getName().compareTo(e2.getName());
			}
		});
	}

	/**
	 * Method of sorting list of employees by name (descending)
	 */
	public void sortEmployeesByNameDesc() {
		employees.sort(new Comparator<Employee>() {
			public int compare(Employee e1, Employee e2) {
				return -e1.getName().compareTo(e2.getName());
			}
		});
	}

	/**
	 * Method of sorting list of employees by salary (ascending)
	 */
	public void sortEmployeesBySalaryAsc() {
		employees.sort(new Comparator<Employee>() {
			public int compare(Employee e1, Employee e2) {
				if (e1.salary() > e2.salary()) {
					return 1;
				} else if (e1.salary() < e2.salary()) {
					return -1;
				} else {
					return 0;
				}
			}
		});
	}

	/**
	 * Method of sorting list of employees by salary (descending)
	 */
	public void sortEmployeesBySalaryDesc() {
		employees.sort(new Comparator<Employee>() {
			public int compare(Employee e1, Employee e2) {
				if (e1.salary() > e2.salary()) {
					return -1;
				} else if (e1.salary() < e2.salary()) {
					return 1;
				} else {
					return 0;
				}
			}
		});
	}

	/**
	 * Method of writing list of employees to the file
	 * 
	 * @throws FileNotFoundException
	 *             if can't find the file
	 * @throws IOException
	 *             if unable to read the file
	 */
	public void writeEmployeesToFile() throws FileNotFoundException, IOException {
		ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream("employees.bin"));
		oo.writeObject(employees);
		oo.close();
	}

	/**
	 * @throws FileNotFoundException
	 *             if can't find the file
	 * @throws IOException
	 *             if unable to read the file
	 * @throws ClassNotFoundException
	 *             if can't find list of employee in the file
	 */
	public void readEmployeesFromFile() throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream oi = new ObjectInputStream(new FileInputStream("employees.bin"));
		employees = (List<Employee>) oi.readObject();
		oi.close();
	}

}

/**
 * The Main method which shows us how much we have learnt during course JAVA
 * CORE
 * 
 * @version 1.00 02 Nov 2016
 * @author Oleksandr Butyter
 */
public class Final {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new EmployeeFixedPayment("Name1", 80000));
		employees.add(new EmployeeHourlyWage("Name2", 500));
		employees.add(new EmployeeFixedPayment("Name3", 85000));
		employees.add(new EmployeeHourlyWage("Name4", 450));
		employees.add(new EmployeeFixedPayment("Name5", 80500));
		employees.add(new EmployeeHourlyWage("Name6", 550));
		employees.add(new EmployeeFixedPayment("Name7", 81000));
		employees.add(new EmployeeHourlyWage("Name8", 650));
		employees.add(new EmployeeFixedPayment("Name9", 84000));
		employees.add(new EmployeeHourlyWage("Name10", 700));
		Department department = new Department(employees);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int menu = 11;
		String pause;
		do {
			System.out.println("\tMENU\n1. Print list of all employees\n"
					+ "2. Print one of employees who has the highest salary\n"
					+ "3. Print one of employees who has the lowest salary\n"
					+ "4. Sort (by name (ascending)) and print list of employees\n"
					+ "5. Sort (by name (descending)) and print list of employees\n"
					+ "6. Sort (by salary (ascending)) and print list of employees\n"
					+ "7. Sort (by salary (descending)) and print list of employees\n"
					+ "8. Write list of employees to the file\n" + "9. Read list of employees from the file\n"
					+ "10. Add employee to the list\n\n" + "0. Exit");

			try {
				menu = Integer.parseInt(br.readLine());
				switch (menu) {
				case 0:
					System.out.println("Bye-bye!");
					break;
				case 1:
					System.out.println("**********List of all employees**********\n");
					for (Employee emp : department.getEmployees()) {
						System.out.println(emp);
					}
					break;
				case 2:
					System.out.println("**********One of employees who has the highest salary**********\n");
					System.out.println(department.findEmployeeWithMaxSalary());
					break;
				case 3:
					System.out.println("**********One of employees who has the lowest salary**********\n");
					System.out.println(department.findEmployeeWithMinSalary());
					break;
				case 4:
					System.out.println("**********Sorted (by name (ascending)) list of employees**********\n");
					department.sortEmployeesByNameAsc();
					for (Employee emp : department.getEmployees()) {
						System.out.println(emp);
					}
					break;
				case 5:
					System.out.println("**********Sorted (by name (descending)) list of employees**********\n");
					department.sortEmployeesByNameDesc();
					for (Employee emp : department.getEmployees()) {
						System.out.println(emp);
					}
					break;
				case 6:
					System.out.println("**********Sorted (by salary (ascending)) list of employees**********\n");
					department.sortEmployeesBySalaryAsc();
					for (Employee emp : department.getEmployees()) {
						System.out.println(emp);
					}
					break;
				case 7:
					System.out.println("**********Sorted (by salary (Descending)) list of employees**********\n");
					department.sortEmployeesBySalaryDesc();
					for (Employee emp : department.getEmployees()) {
						System.out.println(emp);
					}
					break;
				case 8:
					System.out.println("**********Write list of employees to the file (employees.bin)**********\n");
					try {
						department.writeEmployeesToFile();
						System.out.println("List was uploaded!");
					} catch (FileNotFoundException e) {
						System.out.println("Can't find file: employees.bin");
					} catch (IOException e) {
						System.out.println("Unable to write file: employees.bin");
					}
					break;
				case 9:
					System.out.println("**********Read list of employees from the file (employees.bin)**********\n");
					try {
						department.readEmployeesFromFile();
						System.out.println("List was uploaded!");
					} catch (FileNotFoundException e) {
						System.out.println("Can't find file: employees.bin");
					} catch (IOException e) {
						System.out.println("Unable to read file: employees.bin");
					} catch (ClassNotFoundException e) {
						System.out.println("We've just caught ClassNotFoundException! ;) ");
					}

					break;
				case 10:
					department.addEmployee();
					System.out.println("New employee was successfully added!");
					break;
				default:
					System.out.println("!!! Please, enter number of range [ 0 - 10 ] !!!");
					break;
				}
			} catch (NumberFormatException | IOException e) {
				System.out.println("Please, enter number of range [ 0 - 10 ] !!!");
			}
			if (menu != 0) {
				System.out.println("\nPress any key to come back to menu");
				try {
					pause = br.readLine();
				} catch (IOException e) {
					System.out.println("We've just caught IOException! ;) ");
				}
			}
		} while (menu != 0);
	}

}
