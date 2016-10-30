package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Part2 {

	public static void main(String[] args) {
		//Create map personMap and add to it ten persons of type <String, String> (lastName, firstName).
		//Output the entities of the map on the screen. 
		//There are at less two persons with the same firstName among these 10 people?
		//Remove from the map person whose firstName is ”Orest” (or other). Print result.  
		
		Map<String, String> personMap  = new TreeMap();
		personMap.put("Bob", "Marley");
		personMap.put("John", "Dillan");
		personMap.put("Taras", "Kukharets");
		personMap.put("Rick", "Groovy");
		personMap.put("Orest", "Lutiy");
		personMap.put("Bill", "Clinton");
		personMap.put("Lucke", "Besson");
		personMap.put("Sasha", "Gray");
		personMap.put("Rick", "Ashley");
		personMap.put("Hillary", "Clinton");
		System.out.println(personMap);
		Collection <String> s = personMap.values();
		personMap.remove("Orest");
		System.out.println(s);
		
		HashSet<String> f = new HashSet();
		
		for (Map.Entry<String, String> entry : personMap.entrySet()) {
			f.add(entry.getValue());
		}
		
		if (f.size()<personMap.size()){
			System.out.println("There are at less two persons with the same firstName among these 10 people");
		}
		
	}

}
