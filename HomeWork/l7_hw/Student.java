import org.omg.CORBA.Object;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/**
 * Created by Babajko on 18.10.2016.
 */
public class Student{
    private String name;
    private int course;

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
    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }
    public static void printStudents(List<Student> students, int course){
        Iterator it = students.iterator();
        Student st;
        while (it.hasNext()){
            st =(Student) it.next();
            if(st.getCourse() == course) System.out.println(st.getName());
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}

    class NameComparator implements Comparator<Student>{
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

    class CourseComparator implements Comparator<Student>{

        @Override
        public int compare(Student o1, Student o2) {
            return o1.getCourse() - (o2.getCourse());
        }
    }
