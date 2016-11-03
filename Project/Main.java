package com.ss;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Medicine> medicineList = new LinkedList<Medicine>();
		medicineList.add(new Herbion(MedicineType.syrup, 75.05, 100));
		medicineList.add(new Analgin(MedicineType.pills, 23.10, 500));
		medicineList.add(new Anerbion(MedicineType.pills, 215, 20));
		medicineList.add(new Fervex(MedicineType.tea, 25, 150));
		medicineList.add(new Citramon(MedicineType.pills, 10, 100));
		medicineList.add(new Ibuprofen(MedicineType.pills, 125, 100));
		medicineList.add(new Servont(MedicineType.pills, 125, 50));
		medicineList.add(new DoctorMom(MedicineType.pills, 125, 50));
		medicineList.add(new Amrobene(MedicineType.syrup, 120, 10));
		medicineList.add(new Farmacitron(MedicineType.tea, 45, 25));
		medicineList.add(new Aleron(MedicineType.pills, 75.23, 100));
		medicineList.add(new Loratadin(MedicineType.pills, 23.02, 100));
		medicineList.add(new Abactal(MedicineType.pills, 10.20, 123));
		medicineList.add(new Azitrocs(MedicineType.pills, 23.32, 102));
		medicineList.add(new Persen(MedicineType.pills, 102.03, 74));
		medicineList.add(new NovaPassit(MedicineType.pills, 75.30, 100));

		medicineList.sort(new MedicineNameComporator());
		for (Medicine medicine : medicineList) {
			System.out.println(medicine.getName() + medicine);
		}
		System.out.println(" ");
		int max = medicineList.get(0).amount;
		String nameMax = medicineList.get(0).getName();
		for (int i = 0; i < medicineList.size(); i++) {
			if (max < medicineList.get(i).amount) {
				max = medicineList.get(i).amount;
				nameMax = medicineList.get(i).getName();
			}
		}
		System.out.println("Max of amount has  " + nameMax + "  " + max);
		int min = medicineList.get(0).amount;
		String nameMin = medicineList.get(0).getName();
		for (int i = 0; i < medicineList.size(); i++) {
			if (min > medicineList.get(i).amount) {
				min = medicineList.get(i).amount;
				nameMin = medicineList.get(i).getName();
			}
		}
		System.out.println("Min of amount has  " + nameMin + "  " + min);
		System.out.println(" ");
		System.out.println("Enter medicine");
		String enterMed;
		try {
			enterMed = br.readLine();
			for (int i = 0; i < medicineList.size(); i++) {
				if (medicineList.get(i).getName().equals(enterMed)) {
					System.out.print(medicineList.get(i));
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
