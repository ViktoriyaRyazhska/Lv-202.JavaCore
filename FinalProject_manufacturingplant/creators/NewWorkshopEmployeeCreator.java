package com.manufacturingplant.creators;

import java.util.Scanner;

import com.manufacturingplant.entities.WorkshopEmployee;

public class NewWorkshopEmployeeCreator extends WorkshopEmployee {

	public void createNewWorkshopEmployee() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("СТВОРЕННЯ НОВОГО РОБІТНИКА");
		WorkshopEmployee workshopEmployee = new WorkshopEmployee();

		System.out.println("ВВЕДІТЬ ID");
		workshopEmployee.setId(scanner.nextInt());

		System.out.println("ВВЕДІТЬ ІМЯ");
		workshopEmployee.setName(scanner.next());

		System.out.println("ВВЕДІТЬ ПРІЗВИЩЕ");
		workshopEmployee.setLastName(scanner.next());

		System.out.println("ВВЕДІТЬ АДРЕСУ");
		workshopEmployee.setAdress(scanner.next());

		System.out.println("ВВЕДІТЬ ДАТУ НАРОДЖЕННЯ");
		workshopEmployee.setDateOfBirdth(scanner.next());

		System.out.println("ВВЕДІТЬ НОМЕР ТЕЛЕФОНУ");
		workshopEmployee.setPhoneNumber(scanner.next());

		System.out.println("ВВЕДІТЬ ПОСАДУ");
		workshopEmployee.setPosition(scanner.next());

		System.out.println("ВВЕДІТЬ ОКЛАД");
		workshopEmployee.setSalary(scanner.nextInt());

		System.out.println("ВВЕДІТЬ ДАТУ ПОЧАТКУ РОБОТИ");
		workshopEmployee.setStartDate(scanner.next());

		System.out.println(workshopEmployee.toString());

	}

}
