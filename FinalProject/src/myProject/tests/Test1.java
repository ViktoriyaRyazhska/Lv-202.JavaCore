package myProject.tests;

import java.util.Arrays;
import myProject.*;

public class Test1 {

	public static void main(String[] args) {
		Apartment ap = new Apartment();

		HouseholdAppliances h1 = new PersonalComputer("Dell", "1.05", 2012, 2, 220, true, 2.5, 8, 256, "Discrete card");
		HouseholdAppliances h2 = new NoteBook("Lenovo", "2501", 2010, 1, 220, true, 3.1, 6, 320, "Integrated card");
		HouseholdAppliances h3 = new Tablet("Lenovo", "2.0", 2008, 0.8, 220, true, 1.2, 2, 8);
		HouseholdAppliances h4 = new MobilePhone("Samsung", "J120", 2016, 0.1, 220, false, 1.0, 1, 8, 5);
		HouseholdAppliances h5 = new TV("Samsung", "M110", 2005, 1.5, 220, true, 21);
		HouseholdAppliances h6 = new Lamp("lamp maker", "1.0", 2016, 0.2, 220, false, "Led");
		HouseholdAppliances h7 = new Refrigerator("Indesit", "2.0", 2012, 3, 220, true);

		ap.setTechniques(h1, h2, h3, h4, h5, h6, h7);
		ap.getTechniques();

		try {
			System.out.println("\n" + "Consumed " + ap.totalEnergyUsed(100) + " kilowatt-hour" + "\n");
		} catch (TimeException e) {
			System.out.println(e.getMessage());
		}

		HouseholdAppliances.setIsTurnedSeveralTechnique(true, h4, h6);
		HouseholdAppliances.setIsTurnedSeveralTechnique(false, h1, h2, h3);
		

		try {
			System.out.println("Consumed " + ap.totalEnergyUsed(25) + " kilowatt-hour" + "\n");
		} catch (TimeException e) {
			System.out.println(e.getMessage());
		}

		HouseholdAppliances[] array = { h1, h2, h3, h4, h5, h6, h7 };

		Arrays.sort(array);

		System.out.println("HouseholdAppliances sorted by power " + "\n" + Arrays.toString(array));

	}

}
