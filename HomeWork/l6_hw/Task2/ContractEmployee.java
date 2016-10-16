package Task2;

/**
 * Created by Babajko on 14.10.2016.
 */
public class ContractEmployee extends Employee implements Pay {

    private final double federalTaxIdmember = 0.2;
    private int fixedMonthlyPayment;

    public ContractEmployee(String employeeId, String name, int fixedMonthlyPayment) {
        super(employeeId, name);
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    @Override
    public double alculatePay() {
        return fixedMonthlyPayment;
    }

    @Override
    public String print() {
        return super.print() + "Average monthly wage:\t" + alculatePay() + "\n";
    }
}
