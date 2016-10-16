package Task2;

/**
 * Created by Babajko on 16.10.2016.
 */
public class Employee {
    private String employeeId;
    private String name;

    public Employee(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }
    public String print(){
        return "EmployeeId:\t\t\t\t" + employeeId + "\n" +
                "Name:\t\t\t\t\t" + name + "\n";
    }
}
