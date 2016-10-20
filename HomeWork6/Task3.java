import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Student {
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

	@Override
	public String toString() {
		return "Student [name=" + name + ", course=" + course + "]";
	}

}

class NameComparator implements Comparator<Student>{

	public int compare(Student s1, Student s2) {
			return s1.getName().compareTo(s2.getName());
	}
}
class CourseComparator implements Comparator<Student>{

	public int compare(Student s1, Student s2) {
			return s1.getCourse().compareTo(s2.getCourse());
	}
}

public class Task3 {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student("Oleksandr", 1));
		students.add(new Student("Oleh", 1));
		students.add(new Student("Olena", 3));
		students.add(new Student("Petro", 2));
		students.add(new Student("Ruslan", 1));
		printStudents(students, 1);
		System.out.println("*********************");
		students.sort(new NameComparator());
		for (Student stud : students){
			System.out.println(stud);
		}
		System.out.println("*********************");
		students.sort(new CourseComparator());
		for (Student stud : students){
			System.out.println(stud);
		}
	}

	public static void printStudents(List<Student> list, int course) {
		Iterator<Student> i = list.iterator();
		while (i.hasNext()){
			Student stud = i.next(); 
			if (stud.getCourse() == course){
				System.out.println(stud);
			}
		}
		
	}

}
