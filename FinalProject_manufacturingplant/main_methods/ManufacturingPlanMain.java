package com.manufacturingplant.main_methods;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.manufacturingplant.creators.DepartmentCreator;
import com.manufacturingplant.creators.DepartmentEmployeeCreator;
import com.manufacturingplant.creators.EmployeeCreator;
import com.manufacturingplant.creators.NewDepartamentEmployeeCreator;
import com.manufacturingplant.creators.NewWorkshopEmployeeCreator;
import com.manufacturingplant.creators.WorkshopCreator;
import com.manufacturingplant.creators.WorkshopEmployeeCreator;
import com.manufacturingplant.showers.DepartmentEmployeesShower;
import com.manufacturingplant.showers.WorkshopEmployeesShower;

public class ManufacturingPlanMain {

	public static void main(String[] args) {
		System.out.println("МАШИНОБУДІВНИЙ ЗАВОД" + "==============Initialization==============");

		// CREATING DEPARTAMENTS
		DepartmentCreator departmentCreator = new DepartmentCreator();
		departmentCreator.createDepartments();
		// CREATING WORKSHOPS
		WorkshopCreator workshopCreator = new WorkshopCreator();
		workshopCreator.createWorkshops();
		// CREATING EMPLOYEES
		EmployeeCreator employeeCreator = new EmployeeCreator();
		employeeCreator.main(args);
		DepartmentEmployeeCreator departmentEmployeeCreator = new DepartmentEmployeeCreator();
		WorkshopEmployeeCreator workshopEmployeeCreator = new WorkshopEmployeeCreator();

		Scanner scanner = new Scanner(System.in);
		int typedNumber;

		System.out.println("ПОКАЗАТИ ВСІ ВІДДІЛИ ЗАВОДУ     - НАТИСНІТЬ 1");
		System.out.println("ПОКАЗАТИ ВСІ ЦЕХИ ЗАВОДУ        - НАТИСНІТЬ 2");
		System.out.println("ПОКАЗАТИ СПИСОК ВСІХ ІТРів      - НАТИСНІТЬ 3");
		System.out.println("ПОКАЗАТИ СПИСОК ВСІХ РОБІТНИКІВ - НАТИСНІТЬ 4");
		System.out.println("ВНЕСТИ ДАНІ НОВОГО РОБІТНИКА І ПОКАЗАТИ ІНФОРМАЦІЮ ПРО НЬОГО - НАТИСНІТЬ 5");
		System.out.println(
				"ВНЕСТИ ДАНІ НОВОГО ІНЖЕНЕРНО-ТЕХНІЧНОГО РОБІТНИКА І ПОКАЗАТИ ІНФОРМАЦІЮ ПРО НЬОГО - НАТИСНІТЬ 6");

		System.out.println("");

		typedNumber = scanner.nextInt();

		try {
			switch (typedNumber) {

			case 1:
				departmentCreator.showAllDepartments();
				main(args);
				break;

			case 2:
				workshopCreator.showAllWorkshops();
				main(args);
				break;

			case 3:
				DepartmentEmployeesShower departmentEmployeesShower = new DepartmentEmployeesShower();
				departmentEmployeesShower.main(args);
				main(args);
				break;

			case 4:
				WorkshopEmployeesShower workshopEmployeesShower = new WorkshopEmployeesShower();
				workshopEmployeesShower.main(args);
				main(args);
				break;

			case 5:
				NewWorkshopEmployeeCreator newWorkshopEmployeeCreator = new NewWorkshopEmployeeCreator();
				newWorkshopEmployeeCreator.createNewWorkshopEmployee();

				main(args);
				break;

			case 6:
				NewDepartamentEmployeeCreator newDepartamentEmployeeCreator = new NewDepartamentEmployeeCreator();
				newDepartamentEmployeeCreator.createNewDepartamentEmployee();
				main(args);
				break;
			default:
				System.out.println("НЕПРАВИЛЬНИЙ ВВІД СПРОБУЙТЕ ЩЕ РАЗ");
				main(args);
				break;
			}
		} catch (InputMismatchException e) {
			System.out.println("НЕПРАВИЛЬНИЙ ВВІД СПРОБУЙТЕ ЩЕ РАЗ");
			main(args);
		}

	}

}
