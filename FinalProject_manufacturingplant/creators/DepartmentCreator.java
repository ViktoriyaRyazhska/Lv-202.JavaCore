package com.manufacturingplant.creators;

import java.util.ArrayList;

import com.manufacturingplant.entities.Department;

public class DepartmentCreator {

	ArrayList<Department> departments = new ArrayList<>();

	public ArrayList<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(ArrayList<Department> departments) {
		this.departments = departments;
	}

	// CREATING OF DEPARTMENTS
	public ArrayList<Department> createDepartments() {
		Department HRDepartment = new Department(1, "Відділ кадрів", "Макар Роман Богданович");
		Department designDepartment = new Department(3, "Відділ Головного Конструктора", "Казмірчук Богдан Ігорович");
		Department technologyDepartment = new Department(7, "Відділ Головного Технолога",
				"Яблонський Ростислав Ярославович");
		Department supplyAndMaterialDepartment = new Department(9, "Відділ постачання та матеріального забезпечення",
				"Прожиралик Микола Володимирович");
		Department accountDepartment = new Department(11, "Бухгалтерія", "Левкович Василь Васильович");
		Department metrologyDepartment = new Department(15, "Відділ Головного Метролога", "Огородник Ігор Іванович");
		Department mechanicalAndMaintenanceDepartment = new Department(17, "Відділ Головного Механіка",
				"Добринів Петро Павлович");
		departments.add(HRDepartment);
		departments.add(designDepartment);
		departments.add(technologyDepartment);
		departments.add(supplyAndMaterialDepartment);
		departments.add(accountDepartment);
		departments.add(metrologyDepartment);
		departments.add(mechanicalAndMaintenanceDepartment);
		return departments;
	}

	// show all departments
	public void showAllDepartments() {
		System.out.println("-----------------------------");
		System.out.println("СПИСОК ВІДДІЛІВ ЗАВОДУ");
		for (Department department : departments) {
			System.out.println(department.toString());
		}
		System.out.println("-----------------------------");
	}

}
