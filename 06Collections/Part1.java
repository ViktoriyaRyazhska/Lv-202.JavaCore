package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;



public class Part1 {
	static Set union(Set set1, Set set2){
		Set s = new LinkedHashSet();
		Iterator iterator = set1.iterator();
		Iterator iterator1 = set2.iterator();
		   while(iterator.hasNext() && iterator1.hasNext()){
		      s.add(iterator.next());
		    	  s.add(iterator1.next());
		      
		   }
return s;
}
	
	static Set intersect (Set set1, Set set2){
		Set s = new LinkedHashSet();
		Iterator iterator = set1.iterator();
		Iterator iterator1 = set2.iterator();
		while(iterator.hasNext()){
			s.add(iterator.next());
		}
		while(iterator1.hasNext()){
			s.add(iterator1.next());
		} 
				
		   
		return s;}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Character> s = new LinkedHashSet();
		Set<Character> s1 = new LinkedHashSet();
		String st = "Taras Kukharets";
		String st1 = "123455667";
		for (char a :st.toCharArray()){
			s.add(a);
		}
		for (char a :st1.toCharArray()){
			s1.add(a);
		}
		System.out.println(union(s,s1));
		System.out.println(intersect(s,s1));
	}

}
