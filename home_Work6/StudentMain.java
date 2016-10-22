package home_Work6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentMain {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student("Oleg", 1));
		students.add(new Student("Olga", 2));
		students.add(new Student("Nata", 2));
		students.add(new Student("Pavlo", 3));
		students.add(new Student("Vita", 4));
		
		
		
		students.sort(new Student.NameComparator());
		
		System.out.println(students+"\n");
		
		students.sort(new Student.CourseComparator());
		
		System.out.println(students.toString()+"\n");
		
		Student.printStudents(students, 2);
		
		
	}

}
