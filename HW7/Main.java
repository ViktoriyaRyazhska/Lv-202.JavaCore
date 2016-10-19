import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main  {
public static void main(String[] args) {
	List<Student> students = new ArrayList<>();
	class NameComparator implements Comparator<Student> {
		@Override
		public int compare(Student student1, Student student2) {
			return student1.getName().compareTo(student2.getName());
		}
	}

	class CourseComparator implements Comparator<Student> {

		@Override
		public int compare(Student student1, Student student2) {
			return student1.getCourse() - (student2.getCourse());
		}
	}
	
	students.add(new Student("Olya", 2));
	students.add(new Student("Olena", 1));
	students.add(new Student("Oleh", 2));
	
	System.out.println("Students ordered by name");
    students.sort(new NameComparator());
    for (Student student : students) {
        System.out.println(student);
    }
    System.out.println("Students ordered by course");
    students.sort(new CourseComparator());
    for (Student student : students) {
        System.out.println(student);
    }
	
}
}
