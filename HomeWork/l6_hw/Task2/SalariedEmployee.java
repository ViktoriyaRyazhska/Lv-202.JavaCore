package Task2;

/**
 * Created by Babajko on 14.10.2016.
 */
public class SalariedEmployee extends Employee implements Pay {

    private String socialSecurityNumber;
    private int hourlyRate;
    private int numberOfHoursWorked;

    public SalariedEmployee(String employeeId, String name, int hourlyRate, int numberOfHoursWorked) {
        super(employeeId, name);
        this.hourlyRate = hourlyRate;
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    @Override
    public double alculatePay() {
        return (hourlyRate*numberOfHoursWorked);
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public String print() {
        return super.print() + "Average monthly wage:\t" + alculatePay()+"\n";
    }
}
