package softserve.com.map;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapTest {
	public void print(Map<String, String> map) {
		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

	public boolean searchSameName(Map<String, String> map) {
		Set<String> uniqueValues = new HashSet<>(map.values());
		if (map.size() != uniqueValues.size()) {
			return true;
		} else {
			return false;
		}
	}
	
	public void removeName(Map<String, String> map){
		for (Map.Entry<String, String> entry : map.entrySet()) {
			if(entry.getValue()!= "Orest"){
			System.out.println(entry.getKey() + " " + entry.getValue());
			}
		}
	}
}
