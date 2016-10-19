import java.util.ArrayList;
import java.util.List;

/**
 * Created by Babajko on 18.10.2016.
 */
public class Task3 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Ivan", 2));
        students.add(new Student("Bil", 1));
        students.add(new Student("Bob", 3));
        students.add(new Student("Jek", 2));
        students.add(new Student("Mike", 1));

        System.out.println("Students ordered by name");
        students.sort(new NameComparator());
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("\nStudents ordered by course");
        students.sort(new CourseComparator());
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
