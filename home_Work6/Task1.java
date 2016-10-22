package home_Work6;

import java.util.HashSet;
import java.util.Set;

public class Task1 {
	
	public static void union(Set set1, Set set2) {
		Set set = new HashSet(set1);
		set.addAll(set2);
		System.out.println("United sets"+set);
	}
	
	public static void intersect(Set set1, Set set2){
		Set set = new HashSet(set1);
		set.retainAll(set2);
		System.out.println("Intersected sets"+set);
	}

	public static void main(String[] args) {
		
		Set<Integer> set1 = new HashSet<>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		
		Set<Integer> set2 = new HashSet<>();
		set2.add(4);
		set2.add(5);
		set2.add(6);
		set2.add(7);
		
		union(set1, set2);
		intersect(set1, set2);

	}


}
