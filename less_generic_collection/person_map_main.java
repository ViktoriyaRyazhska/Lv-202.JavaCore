package less_generic_collection_1;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class person_map_main {
	public static void main(String[] args) {
		Map<String,String> personMap = new HashMap<>();
		personMap.put("a0", "DFGDB");
		personMap.put("a1", "SDFSF");
		personMap.put("a2", "BNM");
		personMap.put("a3", "FGHF");
		personMap.put("a4", "VBBNM,");
		personMap.put("a5", "CBFDH");
		personMap.put("a6", "VBNVMN");
		personMap.put("a7", "JHHK");
		personMap.put("a8", "RGHGDF");
		personMap.put("a9", "CBCNVVM");
		
		for (Map.Entry<String,String> col : personMap.entrySet()) {
			System.out.println(col);
		}
		Boolean flag=true;
		ArrayList valueMap = new ArrayList(personMap.values());
		for (int i = 0; i < valueMap.size()-1; i++) {
			for (int j = i+1; j < valueMap.size(); j++) {
				if(valueMap.get(i).equals(valueMap.get(j))){
					flag=false;
			}				
		}			
		}
		if(flag==false){
			System.out.println("IS TWO NAME");
		}else System.out.println("IS NOT TWO NAME");
		
		String name= "CBCNVVM";
		Iterator itr = personMap.entrySet().iterator();
		while(itr.hasNext()){
			Entry entry = (Entry<String, String>) itr.next();
			if(name.equals(entry.getValue())){
				itr.remove();
			}
		}
		for (Map.Entry<String,String> col : personMap.entrySet()) {
			System.out.println(col); 
	}
}}
