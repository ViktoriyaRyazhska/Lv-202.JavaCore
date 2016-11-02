
/**
 * Created by Babajko on 29.10.2016.
 */
public class Teacher extends Employee {
    private Lessons lesson;

    public Teacher(String name, String surname, School school, Lessons lesson) {
        super(name, surname, school);
        this.lesson = lesson;
    }

    @Override
    public String printInfo() {
        return super.printInfo() + "\tTeacher lesson: " + lesson;
    }
}
