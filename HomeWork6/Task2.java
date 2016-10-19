import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Task2 {

	public static void main(String[] args) {
		Map<String, String> people = new HashMap<>();
		people.put("Shevchenko", "Andriy");
		people.put("Petrenko", "Mykola");
		people.put("Roman", "Oleksandr");
		people.put("Kovalyk", "Serhiy");
		people.put("Yaciv", "Oleh");
		people.put("Franko", "Ruslan");
		people.put("Martyn", "Ivan");
		people.put("Koval", "Andriy");
		people.put("Petriv", "Petro");
		people.put("Salo", "Pavlo");
		Set<String> count = new HashSet<>();
		for (Map.Entry<String, String> entry : people.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
			count.add(entry.getValue());
		}
		System.out.println("********************************");
		if (count.size() != people.size()) {
			System.out.println("There are persons with the same name");
		} else {System.out.println("There aren't persons with the same name");}
		System.out.println("********************************");
		count.clear();
		for (Map.Entry<String, String> entry : people.entrySet()){
			if (entry.getValue() == "Ivan") {count.add(entry.getKey());}
		}
		for (String s : count){
			people.remove(s);
		}
		System.out.println("... removing Ivan...");
		for (Map.Entry<String, String> entry : people.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

}
