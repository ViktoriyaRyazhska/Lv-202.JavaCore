import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Babajko on 29.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fileNamePupil = "Pupil.bin";
        String fileNameEmployee = "Employee.bin";
        List<Pupil> pupils = new ArrayList<>();
        List<Employee> employeeList = new ArrayList<>();
        try {
            employeeList = Utility.readCollFile(fileNameEmployee);
            pupils = Utility.readCollFile(fileNamePupil);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        School sh13 = new School(13, "nov 12");
/*
        Pupil pupil = new Pupil("Ivan", "Pih", sh13, "7B");

        employeeList.add(new Teacher("Bob", "Hia", sh13, Lessons.HISTORY));
        employeeList.add(new Teacher("Vira", "Drizd", sh13, Lessons.PHYSICS));

        List<Lesson> ls7b = new ArrayList<>();
        ls7b.add(new Lesson(Lessons.HISTORY));
        ls7b.add(new Lesson(Lessons.BIOLOGY));
        ls7b.add(new Lesson(Lessons.PHYSICS));
        ls7b.add(new Lesson(Lessons.CHEMISTRY));
        ls7b.add(new Lesson(Lessons.MATH));

        pupil.setLs(ls7b);

        pupils.add(pupil);
        pupils.add(new Pupil("Petro", "Din", sh13, "7D", Utility.addLessonList(new ArrayList<>())));
        pupils.add(new Pupil("Mike", "Gon", sh13, "7D", Utility.addLessonList(new ArrayList<>())));
        //employeeList.add((Employee) teacher);

        pupils.get(0).getLs().get(1).setRating(5);
        pupils.get(1).getLs().get(0).setRating(3);
*/
        String rl = "0";
        while (true){
            Utility.printSeparator('*', 50);
            System.out.print(
                    "Menu\n"
                    + "1.  Print all people\n"
                    + "2.  Print employees\n"
                    + "3.  Print pupils\n"
                    + "4.  Print salary employees\n"
                    + "5.  To put a mark\n"
                    + "6.  To change salary and working time\n"
                    + "7.  Create employee\n"
                    + "8.  Create pupil\n"
                    + "9.  Delete employee\n"
                    + "10. Delete pupil\n"
            );
            Utility.printSeparator('+', 50);
            switch (rl) {
                case "7": employeeList.add(Utility.createEmployee(sc, sh13)); break;
                case "2": Utility.printEmployees(employeeList); break;
                case "3": Utility.printPupil(pupils, sc); break;
                case "1": People.printAllPersonal(employeeList, pupils); break;
                case "8": pupils.add(Pupil.createPupil(sc, sh13,Utility.addLessonList(new ArrayList<>()))); break;
                case "9": Utility.delPeople(sc, employeeList); break;
                case "10": Utility.delPeople(sc, pupils); break;
                case "4": Utility.salaryEmployees(employeeList); break;
                case "5": Utility.estimatePupil(sc, pupils); break;
                case "6": Utility.toChangeSalaryEmployee(sc, employeeList);break;
                default:
                    break;
            }
            System.out.println("...to complete the program, enter \"end\"");
            rl = sc.nextLine().trim();
            if ( rl.toLowerCase().equals("end")) break;
        }
        try {
            Utility.writeCollFile(fileNamePupil, pupils);
            Utility.writeCollFile(fileNameEmployee, employeeList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
