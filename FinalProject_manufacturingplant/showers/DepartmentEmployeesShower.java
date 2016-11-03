package com.manufacturingplant.showers;

import com.manufacturingplant.creators.DepartmentEmployeeCreator;

public class DepartmentEmployeesShower {

	public static void main(String[] args) {

		DepartmentEmployeeCreator departmentEmployeeCreator = new DepartmentEmployeeCreator();
		
		departmentEmployeeCreator.createDepartmentEmployees();

		departmentEmployeeCreator.showAllDepartmentsEmployees();
	}

}
