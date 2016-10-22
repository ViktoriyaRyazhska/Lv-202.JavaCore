package softserve.com.map;

import java.util.HashMap;
import java.util.Map;

public class Aplication {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("Kovalyk","Oleh");
		map.put("Rutherford","Ivan");
		map.put("Davenport","Orest");
		map.put("Kingsley","Maksum");
		map.put("Bishop","Petro");
		map.put("Yates","Vasul");
		map.put("Hawthorne","Ivanna");
		map.put("Frasier","Olena");
		map.put("Rothchild","Oksana");
		map.put("Whittaker","Orest");
		
		MapTest mapTest = new MapTest();
		//1
		mapTest.print(map);
		//2
		System.out.println(mapTest.searchSameName(map));
		//3
		mapTest.removeName(map);
	}
}
