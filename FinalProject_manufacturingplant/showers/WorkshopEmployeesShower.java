package com.manufacturingplant.showers;

import com.manufacturingplant.creators.WorkshopEmployeeCreator;

public class WorkshopEmployeesShower {

	public static void main(String[] args) {

		WorkshopEmployeeCreator workshopEmployeeCreator = new WorkshopEmployeeCreator();
		
		workshopEmployeeCreator.createWorkshopEmployees();

		workshopEmployeeCreator.showAllWorkshopEmployees();
	}

}
