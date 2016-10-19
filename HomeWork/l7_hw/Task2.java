import java.util.*;

/**
 * Created by Babajko on 18.10.2016.
 */
public class Task2 {
    public static void main (String ... arg){
        Map <String, String> personMap = new HashMap<>();

        personMap.put("Grushevskii", "Muhailo");
        personMap.put("Franko", "Ivan");
        personMap.put("Ukrainka", "Lesja");
        personMap.put("Mazepa", "Ivan");
        personMap.put("Shevchenko", "Taras");
        personMap.put("Vovchok", "Marko");
        personMap.put("Bandera", "Stepan");
        personMap.put("Hmelnyckii", "Bogdan");
        personMap.put("Stus", "Vasul");
        personMap.put("Gogol", "Mykola");
        boolean isRepeatedName = false;
        for(Map.Entry<String, String> entry : personMap.entrySet()){
            System.out.println(entry.getValue() + " " + entry.getKey());
            String tmpStr = entry.getValue();
            personMap.put(entry.getKey(),"");
            if (personMap.containsValue(tmpStr))
                isRepeatedName = true;
            personMap.put(entry.getKey(), tmpStr);
        }
        System.out.println("\nThere are at less two persons with the same firstName among these 10 people?\t"
                + ((isRepeatedName) ? "Yes." : "No")
                + "\n");

        personMap = remoteFirstName(personMap, "Vasul");

        for(Map.Entry<String, String> entry : personMap.entrySet()){
            System.out.println(entry.getValue() + " " + entry.getKey());
        }
    }
    static Map remoteFirstName(Map<String, String> mp, String val){
        if (mp.containsValue(val)) {
            Map<String, String> tmpMap = new HashMap<>();
            for (Map.Entry<String, String> entry : mp.entrySet()) {
                if(entry.getValue() != val) tmpMap.put(entry.getKey(), entry.getValue());
            }
            mp = tmpMap;
        }
        return mp;
    }
}
