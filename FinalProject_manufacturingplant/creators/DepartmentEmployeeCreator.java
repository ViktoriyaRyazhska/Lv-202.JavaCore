package com.manufacturingplant.creators;

import java.util.ArrayList;

import com.manufacturingplant.entities.DepartamentEmployee;

public class DepartmentEmployeeCreator {

	ArrayList<ArrayList<DepartamentEmployee>> departamentEmployees = new ArrayList<>();

	public ArrayList<DepartamentEmployee> createDesignDepartmentEmployees() {
		ArrayList<DepartamentEmployee> DesignDepartmentEmployees = new ArrayList<>();
		DesignDepartmentEmployees.add(new DepartamentEmployee(10038754, "Василь", "Панасюк", "Львів, вул.Зелена",
				"10.01.1986", "067 345 12 34", "Інженер-конструктор 1 кат.", 1900, "15.08.2009"));
		DesignDepartmentEmployees.add(new DepartamentEmployee(10037825, "Петро", "Литвин", "Львів, вул.Тарнавського",
				"12.11.1988", "098 783 0964", "Інженер-конструктор 2 кат.", 1200, "10.01.2011"));
		return DesignDepartmentEmployees;
	}

	public ArrayList<DepartamentEmployee> createTechnologyDepartmentEmployees() {
		ArrayList<DepartamentEmployee> TechnologyDepartmentEmployees = new ArrayList<>();
		TechnologyDepartmentEmployees.add(new DepartamentEmployee(10049306, "іван", "Серкіз", "Львів, вул.Ляшка",
				"15.11.1988", "073 765 87 03", "Інженер-технолог 1 кат.", 2010, "22.05.2007"));
		TechnologyDepartmentEmployees.add(new DepartamentEmployee(10049276, "Інна", "Куліш", "Львів, вул.Наукова",
				"17.11.1978", "096 872 56 34", "Інженер-технолог 2 кат.", 2300, "14.11.2010"));
		return TechnologyDepartmentEmployees;
	}

	public ArrayList<DepartamentEmployee> createHRDepartmentEmployees() {
		ArrayList<DepartamentEmployee> HRDepartmentEmployees = new ArrayList<>();
		HRDepartmentEmployees.add(new DepartamentEmployee(10057845, "Микола", "Стан", "Львів, вул.Городоцька",
				"22.11.1987", "050 894 89 30", "Кадровик", 2040, "07.12.2012"));
		HRDepartmentEmployees.add(new DepartamentEmployee(10051123, "Віктор", "Медов", "Львів, вул.Шевченка",
				"03.11.1982", "096 349 30 97", "Кадровик-учень", 2300, "29.12.2012"));
		return HRDepartmentEmployees;
	}

	public ArrayList<DepartamentEmployee> createSupplyAndMaterialDepartmentEmployees() {
		ArrayList<DepartamentEmployee> SupplyAndMaterialDepartmentEmployees = new ArrayList<>();
		SupplyAndMaterialDepartmentEmployees.add(new DepartamentEmployee(10060934, "Руслан", "Лукянко",
				"Львів, вул.Левицького", "31.11.1974", "099 048 90 09", "Постачальник", 2025, "01.01.2016"));
		SupplyAndMaterialDepartmentEmployees.add(new DepartamentEmployee(10064567, "Надія", "Демчак",
				"Львів, вул.Дністерська", "28.11.1988", "067 284 12 09", "Супер постачальник", 9070, "31.07.2001"));
		return SupplyAndMaterialDepartmentEmployees;
	}

	public ArrayList<DepartamentEmployee> createAccauntDepartmentEmployees() {
		ArrayList<DepartamentEmployee> AccauntDepartmentEmployees = new ArrayList<>();
		AccauntDepartmentEmployees.add(new DepartamentEmployee(10078765, "Богдан", "Мілик", "Львів, вул.Бандери",
				"25.11.1982", "093 097 85 34", "Бухгалтер", 2003, "03.05.2010"));
		AccauntDepartmentEmployees.add(new DepartamentEmployee(10071357, "Ігор", "Мадей", "Львів, вул.Федьковича",
				"29.11.1984", "097 390 49 67", "Бухгалтер", 2930, "21.09.2008"));
		return AccauntDepartmentEmployees;
	}

	public ArrayList<DepartamentEmployee> createMetrologyDepartmentEmployees() {
		ArrayList<DepartamentEmployee> MetrologyDepartmentEmployees = new ArrayList<>();
		MetrologyDepartmentEmployees.add(new DepartamentEmployee(10081379, "Володимир", "Порох", "Львів, вул.Біла",
				"10.11.1979", "098 590 43 91", "Інженер-метролог", 2029, "25.05.2016"));
		MetrologyDepartmentEmployees.add(new DepartamentEmployee(10081470, "Вячеслав", "Герег", "Львів, вул.Грушева",
				"08.11.1981", "067 094 21 89", "Інженер-метролог", 4800, "11.02.2013"));
		return MetrologyDepartmentEmployees;
	}

	public ArrayList<DepartamentEmployee> createMechanicalAndMaintenanceDepartmentEmployees() {
		ArrayList<DepartamentEmployee> MechanicalAndMaintenanceDepartmentEmployees = new ArrayList<>();
		MechanicalAndMaintenanceDepartmentEmployees.add(new DepartamentEmployee(10095487, "Ярослав", "Долшан",
				"Львів, вул.Центральна", "23.11.1989", "050 903 89 34", "Механік", 7050, "28.06.2011"));
		MechanicalAndMaintenanceDepartmentEmployees.add(new DepartamentEmployee(10099103, "Ольга", "Білоус",
				"Львів, вул.Сокальська", "14.11.1990", "098 490 39 67", "Інженер-механік", 2490, "11.03.2010"));
		return MechanicalAndMaintenanceDepartmentEmployees;
	}

	public ArrayList<ArrayList<DepartamentEmployee>> createDepartmentEmployees() {
		departamentEmployees.add(createHRDepartmentEmployees());
		departamentEmployees.add(createDesignDepartmentEmployees());
		departamentEmployees.add(createTechnologyDepartmentEmployees());
		departamentEmployees.add(createSupplyAndMaterialDepartmentEmployees());
		departamentEmployees.add(createAccauntDepartmentEmployees());
		departamentEmployees.add(createMetrologyDepartmentEmployees());
		departamentEmployees.add(createMechanicalAndMaintenanceDepartmentEmployees());
		return departamentEmployees;
	}

	// show all department employees
	public void showAllDepartmentsEmployees() {
		System.out.println("-----------------------------");
		System.out.println("СПИСОК ІНЖЕНЕРНО-ТЕХНІЧНИХ ПРАЦІВНИКІВ");
		for (ArrayList<DepartamentEmployee> departamentEmployee : departamentEmployees) {
			System.out.println(departamentEmployee.toString());
		}
		System.out.println("-----------------------------");
	}
}
