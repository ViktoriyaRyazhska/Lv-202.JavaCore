package less_generic_collection_3;

import java.util.Comparator;

public class nameComperator implements Comparator<Student> {

	
	public int compare(Student o1, Student o2) {		
		return o1.getName().compareTo(o2.getName());
	}
	

}
