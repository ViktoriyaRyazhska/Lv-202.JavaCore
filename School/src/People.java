import java.io.Serializable;
import java.util.List;

/**
 * Created by Babajko on 29.10.2016.
 */
public abstract class People  implements Serializable {
    private String name;
    private String surname;
    private School school;

    public People(String name, String surname, School school) {
        this.name = name;
        this.surname = surname;
        this.school = school;
    }
    public String printInfo(){
        return (name + " " + surname + " "
        );
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public School getSchool() {
        return school;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", school=" + school +
                '}';
    }
    static void printAllPersonal(List... ls) {
        System.out.println("All people:");
        for (List<People> list : ls) {
            for (People pu : list) {
                System.out.println(pu.printInfo());
            }
        }
    }

}
