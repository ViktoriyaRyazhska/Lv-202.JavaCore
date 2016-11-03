package com.manufacturingplant.creators;

public class EmployeeCreator {

	public static void main(String[] args) {

		DepartmentEmployeeCreator departmentEmployeeCreator = new DepartmentEmployeeCreator();
		departmentEmployeeCreator.createDepartmentEmployees();

		WorkshopEmployeeCreator workshopEmployeeCreator = new WorkshopEmployeeCreator();
		workshopEmployeeCreator.createWorkshopEmployees();

	}

}
