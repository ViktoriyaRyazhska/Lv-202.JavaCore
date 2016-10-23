import java.util.*;
/**
 * Created by Babajko on 18.10.2016.
 */
public class Task1 {

    static Set union (Set set1, Set set2){
        Set set = new HashSet(set1);
        set.addAll(set2);
        return set;
    }

    static Set intersect(Set set1, Set set2){
        Set set = new HashSet(set1);
        set.retainAll(set2);
        return set;
    }
    public static void main (String [] arg){
        Set set1 = new HashSet();
        Set set2 = new HashSet();

        Random rd = new Random();

        for (int i = 0; i < 10; i++) {
            set1.add(rd.nextInt(20));
            set2.add(i);
        }
        System.out.println(union(set1, set2));
        System.out.println(intersect(set1, set2));

    }
}
