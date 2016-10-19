import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Student {
	private String name;
	private int course;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	public Student(String name, int course) {
		super();
		this.name = name;
		this.course = course;
	}
	

	@Override
	public String toString() {
		return "Student [name=" + name + ", course=" + course + "]";
	}

	public static void printStudents(List students, Integer course) {
		Iterator it = students.iterator();
		Student student;
		while (it.hasNext()) {
			student = (Student) it.next();
			if (student.getCourse() == course)
				System.out.println(student.getName());
		}
	}

	

}
