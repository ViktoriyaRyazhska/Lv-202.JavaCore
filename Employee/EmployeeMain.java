package Lesson6.HomeWork.Employee;

import java.util.Arrays;

public class EmployeeMain {

	public static void main(String[] args) {

		/*
		 * Create an array of employees and add the employees with different
		 * form of payment. Arrange the entire sequence of workers descending
		 * the average monthly wage. Output the employee ID, name, and the
		 * average monthly wage for all elements of the list.
		 */

		Employee[] employees = { new ContractEmployee("Sarah", 1500, "3"), new ContractEmployee("John", 2000, "3"),
				new ContractEmployee("Ura", 999.99, "7"), new SalariedEmployee("Vas", 10.067, 240, "7"),
				new SalariedEmployee("Ivan", 8.88, 7.56, "7") };

		// Arrange the entire sequence of workers descending the average monthly
		// wage
		System.out.println("Arranging the entire sequence of workers descending the average monthly wage");
		Employee temp;
		for (int i = 0; i < employees.length - 1; i++) {
			for (int j = i + 1; j < employees.length; j++) {
				if (((Payable) employees[j]).calculatePay() > ((Payable) employees[i]).calculatePay()) {
					temp = employees[j];
					employees[j] = employees[i];
					employees[i] = temp;
				}
			}
		}
		for (int i = 0; i < employees.length; i++) {
			System.out.println(employees[i]);
		}

		// Output the employee ID, name, and the average monthly wage for all
		// elements of the list
		System.out.println("Output the employee ID, name, and the average monthly wage for all elements of the list -> ");
		for (Employee employee : employees) {
			employee.outputting();
		}
	}

}
