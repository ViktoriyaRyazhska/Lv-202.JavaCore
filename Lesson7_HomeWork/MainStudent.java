package Lesson7.HomeWork;

import java.util.ArrayList;

public class MainStudent {

	public static void main(String[] args) {

		// declare List students and add to the list five different students
		Student student1 = new Student("Anton", 5);
		Student student2 = new Student("Boris", 4);
		Student student3 = new Student("Cris", 3);
		Student student4 = new Student("Davyd", 2);
		Student student5 = new Student("Evy", 1);

		ArrayList<Student> students = new ArrayList<>();
		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		students.add(student5);

		// display the list of students ordered by name
		System.out.println("Displaying the list of students ordered by name");
		students.sort(new NameComparator());
		System.out.println(students);

		// display the list of students ordered by course.
		System.out.println("Displaying the list of students ordered by course");
		students.sort(new CourseComparator());
		System.out.println(students);
	}
}
