import java.util.Scanner;

/**
 * Created by Babajko on 30.10.2016.
 */
public class OtherEmployee extends Employee {
    private String position;

    public OtherEmployee(String name, String surname, School school, String position) {
        super(name, surname, school);
        this.position = position;
    }

    @Override
    public String printInfo() {
        return super.printInfo() + "\t" + position;
    }
}
