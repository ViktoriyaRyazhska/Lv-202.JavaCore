package Lesson7.HomeWork;

import java.util.ArrayList;
import java.util.HashMap;

/*
 * Create map personMap and add to it ten persons of type <String, String> (lastName, firstName).
Output the entities of the map on the screen. 
There are at less two persons with the same firstName among these 10 people?
Remove from the map person whose firstName is ”Orest” (or other). Print result.  
 */
public class MapTask {

	HashMap<String, String> personMap = new HashMap<>();

	public HashMap<String, String> addTenPerson() {
		personMap.put("Zozylia", "Udgin");
		personMap.put("Dmyterko", "Petro");
		personMap.put("Vlasenko", "Zoriana");
		personMap.put("Tymoshenko", "NotJulia");
		personMap.put("Kredo", "Notbank");
		personMap.put("Bond", "Pavlo");
		personMap.put("Vlad", "Bogdan");
		personMap.put("Redclif", "Harry");
		personMap.put("Savlyk", "Zoriana");
		personMap.put("Mandzya", "Orest");
		return personMap;
	}

	public void outputEntitiesOfMapOnScreen() {
		System.out.println("We have following persons = ");
		for (HashMap.Entry<String, String> persons : personMap.entrySet()) {
			System.out.println(persons);
		}
	}

	// There are at less two persons with the same firstName among these 10
	// people?
	public void checkIfTheraAreAtLeastTwoPersonsWithTheSameName() {
		System.out.println("There are at less two persons with the same firstName among these 10 people?");
		Boolean checker = true;
		ArrayList valueMap = new ArrayList(personMap.values());
		for (int i = 0; i < valueMap.size() - 1; i++) {
			for (int j = i + 1; j < valueMap.size(); j++) {
				if (valueMap.get(i).equals(valueMap.get(j))) {
					checker = false;
				}
			}
		}
		if (checker == false) {
			System.out.println("No, there are not");
		} else
			System.out.println("Yes, there are at less two persons with the same first name among these 10 people");
		System.out.println("\n");
	}

	// Remove from the map person whose firstName is ”Orest” (or other). Print
	// result.
	public void removeOrestFromPersonMap() {
		System.out.println("Let`s remove Orest from person list .....");
		System.out.println("\n");
		System.out.println(".....in process.....Orest bye, bye");
		if (personMap.containsValue("Orest")) {
			HashMap<String, String> tmpMap = new HashMap<>();
			for (HashMap.Entry<String, String> entry : personMap.entrySet()) {
				if (entry.getValue() != "Orest")
					tmpMap.put(entry.getKey(), entry.getValue());
			}
			System.out.println("\n");
			System.out.println("Now we have following persons without Orest = ");
			personMap = tmpMap;
			for (HashMap.Entry<String, String> persons : tmpMap.entrySet()) {
				System.out.println(persons);
			}
		}

	}

	public void setPersonMap(HashMap<String, String> personMap) {
		this.personMap = personMap;
	}

}
