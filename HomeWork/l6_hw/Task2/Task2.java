package Task2;

/**
 * Created by Babajko on 16.10.2016.
 */
public class Task2 {
    public static void main (String[] arg){
        Employee [] employees = new Employee[5];

        employees[0] = new ContractEmployee("1", "Ivan", 1100);
        employees[1] = new SalariedEmployee("2", "Ira", 300, 22);
        employees[2] = new SalariedEmployee("3", "Bob", 600, 22);
        employees[3] = new ContractEmployee("4", "Oleg", 1200);
        employees[4] = new SalariedEmployee("5", "Olena", 500, 22);

        for (Employee employee : employees){
            System.out.println(employee.print());
        }
    }
}
