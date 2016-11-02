import java.util.List;
import java.util.Scanner;


/**
 * Created by Babajko on 29.10.2016.
 */
public class Pupil extends People {
    private String group;
    private List<Lesson> ls;

    public Pupil(String name, String surname, School school, String group) {
        super(name, surname, school);
        this.group = group;
    }

    public Pupil(String name, String surname, School school, String group, List<Lesson> ls) {
        super(name, surname, school);
        this.group = group;
        this.ls = ls;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setLs(List<Lesson> ls) {
        this.ls = ls;
    }

    public String getGroup() {
        return group;
    }

    public List<Lesson> getLs() {
        return ls;
    }

    @Override
    public String printInfo() {
        return super.printInfo() + "\tPupil: " + group;

    }

    public void printRating (){
        for (Lesson lss : this.ls){
            System.out.println("\t" + lss.getLesson().toString().toLowerCase() + "\t: " + lss.getRating());
        }
    }
    public double readAVGRating(){
        double sum = 0;
        for (Lesson lss : this.ls){
            sum += lss.getRating();
        }
        return sum/this.ls.size();
    }
    public static Pupil createPupil(Scanner sc, School sh, List<Lesson> ls){
        System.out.print("Please enter name: ");
        String name = sc.nextLine();
        System.out.print("Please enter surname: ");
        String surname = sc.nextLine();
        System.out.print("Please enter group: ");
        String group = sc.nextLine();
        return new Pupil(name, surname, sh, group, ls);
    }
}
