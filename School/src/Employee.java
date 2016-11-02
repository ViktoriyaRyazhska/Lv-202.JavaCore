
/**
 * Created by Babajko on 29.10.2016.
 */
public class Employee extends People {
    private int salary;
    private int workingHours;

    public Employee(String name, String surname, School school) {
        super(name, surname, school);
    }

    public int getSalary() {
        return salary;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    public double calcSalary(){
        return salary * workingHours;
    }
}
