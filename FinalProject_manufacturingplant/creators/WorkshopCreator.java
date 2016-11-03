package com.manufacturingplant.creators;

import java.util.ArrayList;

import com.manufacturingplant.entities.Workshop;

public class WorkshopCreator {

	ArrayList<Workshop> workshops = new ArrayList<>();

	// creating of workshops
	public ArrayList<Workshop> createWorkshops() {
		Workshop toolWorkshop = new Workshop(40, "Інструментальний цех", "Лахін Віктор Павлович");
		Workshop machiningWorkshop = new Workshop(1, "Механічний цех", "Мійсин Василь Степанович");
		Workshop galvanicWorkshop = new Workshop(2, "Гальванічний цех", "Тарнавська Марія Степанівна");
		Workshop microassemblyWorkshop = new Workshop(8, "Цех мікроскладання", "Галицький Ігор Васильович");
		Workshop mechanicalWorkshop = new Workshop(34, "Механіко-ремонтний цех", "Митник Микола Васильович");
		Workshop micromachiningWorkshop = new Workshop(20, "Мікромеханічний цех", "Бей Михайло Васильович");
		Workshop castingAndMouldingWorkshop = new Workshop(10, "Ливарний цех", "Пронюк Марія Прокопівна");
		Workshop forgingWorkshop = new Workshop(7, "Ковальсько-пресовий цех", "Денис Ігор Юрійович");

		workshops.add(toolWorkshop);
		workshops.add(machiningWorkshop);
		workshops.add(galvanicWorkshop);
		workshops.add(microassemblyWorkshop);
		workshops.add(mechanicalWorkshop);
		workshops.add(micromachiningWorkshop);
		workshops.add(castingAndMouldingWorkshop);
		workshops.add(forgingWorkshop);
		return workshops;
	}

	public void showAllWorkshops() {
		System.out.println("-----------------------------");
		System.out.println("СПИСОК ЦЕХІВ ЗАВОДУ");
		for (Workshop workshop : workshops) {
			System.out.println(workshop.toString());
		}
		System.out.println("-----------------------------");
	}

}
