package myProject.tests;

import java.util.ArrayList;
import myProject.*;

public class Test2 {

	private static void electronicSorting(ArrayList<Electronics> list) {
		for (Electronics pc : list) {
			System.out.println(pc.getMaker() + ", Frequency of processor: " + pc.getFrequencyOfProcessor() + ", RAM: "
					+ pc.getExtentOfRAM() + ", Hard disc capacity: " + pc.getMemoryCapacity());
		}
	}

	public static void main(String[] args) {

		Electronics e1 = new PersonalComputer("Dell", 1.4, 2, 256);
		Electronics e2 = new PersonalComputer("Dell", 2.6, 8, 320);
		Electronics e3 = new PersonalComputer("Intel", 1.3, 4, 320);
		Electronics e4 = new PersonalComputer("Dell", 3.2, 16, 1024);
		Electronics e5 = new PersonalComputer("HP", 3.3, 3, 80);

		ArrayList<Electronics> PCList = new ArrayList<>();
		PCList.add(e1);
		PCList.add(e2);
		PCList.add(e3);
		PCList.add(e4);
		PCList.add(e5);

		PCList.sort(new Electronics.FrequencyOfProcessorComparator());

		System.out.println("Personal Computers sorted by frequency of processor:" + "\n");

		Test2.electronicSorting(PCList);

		PCList.sort(new Electronics.ExtentOfRAMComparator());

		System.out.println("\n" + "Personal Computers sorted by extent of RAM: " + "\n");

		Test2.electronicSorting(PCList);

		PCList.sort(new Electronics.MemoryCapacityComparator());

		System.out.println("\n" + "Personal Computers sorted by memory capacity: " + "\n");

		Test2.electronicSorting(PCList);

	}

}
