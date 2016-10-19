package less_generic_collection_3;

import java.util.Comparator;

public class course_Comperator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {		
		return o1.getCourse()-o2.getCourse();
	}
	
}
