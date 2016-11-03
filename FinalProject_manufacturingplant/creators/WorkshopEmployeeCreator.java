package com.manufacturingplant.creators;

import java.util.ArrayList;

import com.manufacturingplant.entities.WorkshopEmployee;

public class WorkshopEmployeeCreator {

	ArrayList<ArrayList<WorkshopEmployee>> workshopEmployees = new ArrayList<>();

	public ArrayList<WorkshopEmployee> createToolWorkshopEmployees() {
		ArrayList<WorkshopEmployee> ToolWorkshopEmployees = new ArrayList<>();
		ToolWorkshopEmployees.add(new WorkshopEmployee(10408754, "Петро", "Панасюк", "с. Холодновідка вул.Біла",
				"10.01.1956", "067 545 12 94", "Слюсар", 4900, "15.08.1999"));
		ToolWorkshopEmployees.add(new WorkshopEmployee(10407825, "Захар", "Литвин", "Львів, вул.Городоцька",
				"12.11.1958", "073 783 0214", "Токар-фрезерувальник-розточник", 5300, "10.03.2001"));
		return ToolWorkshopEmployees;
	}

	public ArrayList<WorkshopEmployee> createMachiningWorkshopEmployees() {
		ArrayList<WorkshopEmployee> MachiningWorkshopEmployees = new ArrayList<>();
		MachiningWorkshopEmployees.add(new WorkshopEmployee(10019306, "Устим", "Грицай", "с. Зимнюща Зима",
				"18.01.1958", "073 765 87 03", "Фрезерувальник", 5010, "12.05.1995"));
		MachiningWorkshopEmployees.add(new WorkshopEmployee(10019276, "Ігор", "Ваврин", "Львів, вул.Липинського",
				"17.11.1978", "096 872 56 34", "Оператор верстата з ЧПК", 5300, "04.11.2008"));
		return MachiningWorkshopEmployees;
	}

	public ArrayList<WorkshopEmployee> createGalvanicWorkshopEmployees() {
		ArrayList<WorkshopEmployee> GalvanicWorkshopEmployees = new ArrayList<>();
		GalvanicWorkshopEmployees.add(new WorkshopEmployee(10027845, "Микола", "Беркут", "Львів, вул.Любінська",
				"24.04.1957", "050 093 89 30", "Гальванік", 4040, "07.12.1983"));
		GalvanicWorkshopEmployees.add(new WorkshopEmployee(10021123, "Віктор", "Котик", "Львів, вул.Городоцька",
				"11.07.1952", "098 435 30 97", "Гальванік", 4300, "29.12.1980"));
		return GalvanicWorkshopEmployees;
	}

	public ArrayList<WorkshopEmployee> createMicroassemblyWorkshopEmployees() {
		ArrayList<WorkshopEmployee> MicroassemblyWorkshopEmployees = new ArrayList<>();
		MicroassemblyWorkshopEmployees.add(new WorkshopEmployee(10080934, "Максим", "Перепелиця", "Львів, вул.Садова",
				"21.01.1984", "098 048 85 09", "Складальник", 3025, "03.03.2011"));
		MicroassemblyWorkshopEmployees.add(new WorkshopEmployee(10084567, "Надія", "Герус", "Львів, вул.Федьковича",
				"18.10.1991", "073 284 84 09", "Складальник", 3070, "31.10.2014"));
		return MicroassemblyWorkshopEmployees;
	}

	public ArrayList<WorkshopEmployee> createMechanicalWorkshopEmployees() {
		ArrayList<WorkshopEmployee> MechanicalWorkshopEmployees = new ArrayList<>();
		MechanicalWorkshopEmployees.add(new WorkshopEmployee(10348765, "Святослав", "Мізин", "Львів, вул.Залізнична",
				"25.05.1988", "093 468 85 34", "Механік", 4003, "04.05.2012"));
		MechanicalWorkshopEmployees.add(new WorkshopEmployee(10341357, "Адам", "Тадеуш", "Львів, вул.Скляна",
				"29.11.1974", "098 789 49 67", "Слюсар", 4930, "21.09.1999"));
		return MechanicalWorkshopEmployees;
	}

	public ArrayList<WorkshopEmployee> createMicromachiningWorkshopEmployees() {
		ArrayList<WorkshopEmployee> MicromachiningWorkshopEmployees = new ArrayList<>();
		MicromachiningWorkshopEmployees.add(new WorkshopEmployee(10201379, "Ярослав", "Петрук", "Львів, вул.Сахарова",
				"10.11.1988", "098 456 43 56", "Інженер-технолог", 4029, "11.05.2010"));
		MicromachiningWorkshopEmployees.add(new WorkshopEmployee(10201470, "Ігор", "Мечес", "Львів, вул.Патона",
				"08.11.1941", "050 234 21 89", "Слюсар", 4800, "11.02.1965"));
		return MicromachiningWorkshopEmployees;
	}

	public ArrayList<WorkshopEmployee> createCastingAndMouldingWorkshopEmployees() {
		ArrayList<WorkshopEmployee> CastingAndMouldingWorkshopEmployees = new ArrayList<>();
		CastingAndMouldingWorkshopEmployees.add(new WorkshopEmployee(10105487, "Іван", "Ваврух", "Львів, вул.Стрийська",
				"22.01.1969", "050 345 89 67", "Ливарник", 5050, "28.06.2006"));
		CastingAndMouldingWorkshopEmployees.add(new WorkshopEmployee(10109103, "Ольга", "Білоус",
				"Львів, вул.Хотинська", "14.11.1970", "098 567 39 23", "Інженер-технолог", 5490, "16.07.1998"));
		return CastingAndMouldingWorkshopEmployees;
	}

	public ArrayList<WorkshopEmployee> createForgingWorkshopEmployees() {
		ArrayList<WorkshopEmployee> ForgingWorkshopEmployees = new ArrayList<>();
		ForgingWorkshopEmployees.add(new WorkshopEmployee(10075487, "Олександр", "Пушкін", "Львів, вул.Хмельницького",
				"22.01.1959", "050 679 89 35", "Інженер-технолог", 5070, "28.06.1990"));
		ForgingWorkshopEmployees.add(new WorkshopEmployee(10079103, "Олександр", "Білий", "Львів, вул.Кривоноса",
				"14.11.1950", "67 028 39 29", "Терміст", 4490, "16.07.1978"));
		return ForgingWorkshopEmployees;
	}

	public ArrayList<ArrayList<WorkshopEmployee>> createWorkshopEmployees() {
		workshopEmployees.add(createToolWorkshopEmployees());
		workshopEmployees.add(createMachiningWorkshopEmployees());
		workshopEmployees.add(createGalvanicWorkshopEmployees());
		workshopEmployees.add(createMicroassemblyWorkshopEmployees());
		workshopEmployees.add(createMechanicalWorkshopEmployees());
		workshopEmployees.add(createMicromachiningWorkshopEmployees());
		workshopEmployees.add(createCastingAndMouldingWorkshopEmployees());
		workshopEmployees.add(createForgingWorkshopEmployees());
		return workshopEmployees;
	}

	// show all department employees
	public void showAllWorkshopEmployees() {
		System.out.println("-----------------------------");
		System.out.println("СПИСОК РОБІТНИКІВ");
		for (ArrayList<WorkshopEmployee> workshopEmployee : workshopEmployees) {
			System.out.println(workshopEmployee.toString());
		}
		System.out.println("-----------------------------");
	}

}
