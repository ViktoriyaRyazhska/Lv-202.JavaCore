package com.manufacturingplant.creators;

import java.util.Scanner;

import com.manufacturingplant.entities.DepartamentEmployee;

public class NewDepartamentEmployeeCreator {

	public void createNewDepartamentEmployee() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("СТВОРЕННЯ НОВОГО ІТРа");
		DepartamentEmployee departamentEmployee = new DepartamentEmployee();

		System.out.println("ВВЕДІТЬ ID");
		departamentEmployee.setId(scanner.nextInt());

		System.out.println("ВВЕДІТЬ ІМЯ");
		departamentEmployee.setName(scanner.next());

		System.out.println("ВВЕДІТЬ ПРІЗВИЩЕ");
		departamentEmployee.setLastName(scanner.next());

		System.out.println("ВВЕДІТЬ АДРЕСУ");
		departamentEmployee.setAdress(scanner.next());

		System.out.println("ВВЕДІТЬ ДАТУ НАРОДЖЕННЯ");
		departamentEmployee.setDateOfBirdth(scanner.next());

		System.out.println("ВВЕДІТЬ НОМЕР ТЕЛЕФОНУ");
		departamentEmployee.setPhoneNumber(scanner.next());

		System.out.println("ВВЕДІТЬ ПОСАДУ");
		departamentEmployee.setPosition(scanner.next());

		System.out.println("ВВЕДІТЬ ОКЛАД");
		departamentEmployee.setSalary(scanner.nextInt());

		System.out.println("ВВЕДІТЬ ДАТУ ПОЧАТКУ РОБОТИ");
		departamentEmployee.setStartDate(scanner.next());

		System.out.println(departamentEmployee.toString());

	}

}
