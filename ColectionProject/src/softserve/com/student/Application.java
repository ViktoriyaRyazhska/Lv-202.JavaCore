package softserve.com.student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		List<Student> student = new ArrayList<>();
		student.add(new Student("Olena", 2));
		student.add(new Student("Oksana", 4));
		student.add(new Student("Petro", 3));
		student.add(new Student("Ivan", 1));
		student.add(new Student("Artem", 5));
		
		Collections.sort(student);
		System.out.print(student);
		System.out.println();
		Collections.sort(student, new StudentComparator());
		System.out.println(student);
	}

}
