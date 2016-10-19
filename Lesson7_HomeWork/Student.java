package Lesson7.HomeWork;

import java.util.Iterator;
import java.util.List;

public class Student {

	private String name;
	private int course;
	
	

	public Student(String name, int course) {
		this.name = name;
		this.course = course;
	}

	public String getName() {
		return name;
	}

	public int getCourse() {
		return course;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCourse(int course) {
		this.course = course;
	}	

	// /method printStudents (List students, Integer course), which receives a
	// list of students and the course number and prints to the console the
	// names of the students from the list, which are taught in this course (use
	// an iterator)
	public static void printStudents(List<Student> students, int course) {
		Iterator iterator = students.iterator();
		Student student;
		while (iterator.hasNext()) {
			student = (Student) iterator.next();
			if (student.getCourse() == course)
				System.out.println(student.getName());
		}
	}

	@Override
	public String toString() {
		return "Student name " + name + " on course " + course + "\n";
	}

}
