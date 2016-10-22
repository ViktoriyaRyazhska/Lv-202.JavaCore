package home_Work6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Task2 {

	public static void main(String[] args) throws IOException {
		Map<String, String> personMap = new HashMap<>();

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		personMap.put("Korenovska", "Natalia");
		personMap.put("Mahun", "Andrii");
		personMap.put("Kuchmenda", "Vitia");
		personMap.put("Dunia", "Nazik");
		personMap.put("Glad", "Roman");
		personMap.put("Rogovskii", "Roman");
		personMap.put("Podz", "Vova");
		personMap.put("Sulupa", "Roman");
		personMap.put("Tkach", "Andrii");
		personMap.put("Suniak", "Pavlo");

		System.out.println(personMap + "\n");

		int count1 = 0;

		for (Map.Entry<String, String> entry : personMap.entrySet()) {
			int count = 0;
			for (Map.Entry<String, String> entry1 : personMap.entrySet()) {
				if (entry.getValue().equals(entry1.getValue())) {
					count++;
				}
				if (count > 1) {
					count1++;
					break;
				}

			}
		}
		if (count1 > 1) {
			System.out.println("There are at less two persons with the same firstName");
		} else {
			System.out.println("There are NOT at less two persons with thesame firstName");
		}

		System.out.println("\n" + "Enter the name who will be removed");
		String name = reader.readLine();

		Set<String> removeNames = new HashSet<>();

		for (Map.Entry<String, String> entry : personMap.entrySet()) {
			if (entry.getValue().equals(name)) {
				removeNames.add(entry.getKey());
			}
		}

		for (String name1 : removeNames) {
			personMap.remove(name1);
		}

		System.out.println(personMap);

	}

}
