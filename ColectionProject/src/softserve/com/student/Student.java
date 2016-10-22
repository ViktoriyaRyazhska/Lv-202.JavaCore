package softserve.com.student;

import java.util.Iterator;
import java.util.List;

public class Student implements Comparable<Student>{
	private String name;
	private Integer course;

	public Student(String name, Integer course) {
		this.name = name;
		this.course = course;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	public void printStudents(List<Student> students, Integer course) {
		Iterator<Student> it = students.iterator();
		while (it.hasNext( )) {
	        System.out.println (it.next( ));
	    }

	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", course=" + course + "]";
	}

	@Override
	public int compareTo(Student o) {
		return name.compareTo(o.name);
	}
}
