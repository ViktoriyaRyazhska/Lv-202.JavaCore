import java.io.*;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Babajko on 31.10.2016.
 */
public class Utility {
    public static void printSeparator(char ch, int count){
        String str = "";
        for (int i = 0; i < count; i++){
            str += ch;
        }
        System.out.println(str);
    }
    //Запис Ліста в файл
    static void writeCollFile(String fileName, List list)throws IOException {
        FileOutputStream fr = null;
        ObjectOutputStream obs = null;
        try {
            fr = new FileOutputStream(fileName);
            obs = new ObjectOutputStream(fr);
            obs.writeObject(list);
        } finally {
            if (obs != null) obs.close();
            if (fr != null) fr.close();
        }
    }
    //Читання Ліста з файлу
    static List readCollFile(String fileName) throws IOException, ClassNotFoundException {
        FileInputStream fi = null;
        ObjectInputStream ois = null;
        List ls = null;
        try {
            fi = new FileInputStream(fileName);
            ois = new ObjectInputStream(fi);
            ls = (List) ois.readObject();
        } finally {
            if (ois != null) ois.close();
            if (fi != null) fi.close();
        }
        return ls;
    }

    static String lessonsStr(){
        return Lessons.BIOLOGY.toString() + ", "
                + Lessons.CHEMISTRY.toString() + ", "
                + Lessons.HISTORY.toString() + ", "
                + Lessons.MATH.toString() + ", "
                + Lessons.PHYSICS.toString();
    }

    static void printEmployees(List<Employee> employeeList) {
        for (Employee em : employeeList) {
            System.out.println(em.printInfo() + "\n");
        }
    }

    static void printPupil(List<Pupil> pupils, Scanner sc) {
        System.out.print("Enter group :");
        String group = sc.nextLine().trim();
        if (group.equals("")) printReport(pupils);
        else printReport(pupils, group.toUpperCase());
    }

    static List addLessonList(List<Lesson> list){
        list.add(new Lesson(Lessons.HISTORY));
        list.add(new Lesson(Lessons.BIOLOGY));
        list.add(new Lesson(Lessons.PHYSICS));
        list.add(new Lesson(Lessons.MATH));
        return list;
    }

    public static void printReport(List<Pupil> ls, String gr){
        for(Pupil pu : ls){
            if (pu.getGroup().equals(gr)) {
                System.out.println(pu.printInfo());
                pu.printRating();
                System.out.println(pu.readAVGRating());
                Utility.printSeparator('-', 50);
                System.out.println();
            }
        }
    }

    public static void printReport(List<Pupil> ls){
        for(Pupil pupil : ls){
            System.out.println(pupil.printInfo());
            pupil.printRating();
            System.out.println("\tmean score: " + pupil.readAVGRating());
            Utility.printSeparator('-', 50);
            System.out.println();
        }
    }

    static void estimatePupil(Scanner sc, List<Pupil> pupils){
        for (int i = 0; i < pupils.size(); i++){
            System.out.println(" " + i + ". "+ pupils.get(i).printInfo());
        }
        System.out.print("Enter number pupil:");
        int puNum = checkWriteStr(sc.nextLine(), pupils.size());
        if (puNum == -1) {
            System.out.println("\nEntered an incorrect type or number!!!\n");
            return;
        }
        Pupil pupil = pupils.get(puNum);

        System.out.println(pupil.printInfo());
        for (int i = 0; i < pupil.getLs().size(); i++){
            System.out.println(" " + i + ". "+ pupil.getLs().get(i).getLesson().toString().toLowerCase()
                    + "\t" + pupil.getLs().get(i).getRating()
            );
        }
        System.out.print("Enter number lesson:");

        int lesNum = checkWriteStr(sc.nextLine(), pupil.getLs().size());
        if (lesNum == -1) {
            System.out.println("\nEntered an incorrect type or number!!!\n");
            return;
        }
        Lesson lesson = pupil.getLs().get(lesNum);
        System.out.println("Current estimate: " + lesson.getRating());
        System.out.print("Enter estimate:");
        lesson.setRating(checkWriteStr(sc.nextLine(), 100));
    }

    static void salaryEmployees(List<Employee> employeeList) {
        for (Employee em : employeeList) {
            System.out.print(em.getName() + " " + em.getSurname());
            System.out.println(" salary: " + em.calcSalary());
        }
    }

    public static Employee createEmployee(Scanner sc, School sh){
        System.out.print("Please enter name: ");
        String name = sc.nextLine();
        System.out.print("Please enter surname: ");
        String surname = sc.nextLine();
        System.out.println("Select which add employee\n" +
                " 0. Employee\n" +
                " 1. Teacher");
        String chCreate = sc.nextLine().trim().toLowerCase();
        if (chCreate.equals("0")) {
            System.out.print("Please enter position: ");
            String position = sc.nextLine();
            return new OtherEmployee(name, surname, sh, position);
        }else if(chCreate.equals("1")){
            System.out.print("Please enter lesson: ");
            System.out.println(Utility.lessonsStr().toLowerCase());
            String lesson = sc.nextLine().trim().toLowerCase();
            return new Teacher(name, surname, sh, Lesson.strToLesson(lesson));
        }else return null;
    }

    static void delPeople(Scanner sc, List... ls) {
        for (List<People> list : ls) {
            for (int i = 0; i < list.size(); i++) {
                System.out.println(" " + i +". " + list.get(i).printInfo());
            }
            System.out.println("Enter the number of an employee to delete");
            int remoteNum = checkWriteStr(sc.nextLine(), list.size());
            if (remoteNum == -1) {
                System.out.println("\nEntered an incorrect type or number!!!\n");
                return;
            }
            list.remove(remoteNum);
        }
    }

    public static void toChangeSalaryEmployee(Scanner sc, List<Employee> employeeList) {
        for (int i = 0; i < employeeList.size(); i++) {
            System.out.println(" " + i +". " + employeeList.get(i).getSurname() + " "
                + employeeList.get(i).getName()
                + "\tworking time:\t" + employeeList.get(i).getWorkingHours()
                + "\tsalary\t" + employeeList.get(i).getSalary()
            );
        }
        System.out.print("Enter number employee :");
        int num = checkWriteStr(sc.nextLine(), employeeList.size());
        if (num == -1) {
            System.out.println("\nEntered an incorrect type or number!!!\n");
            return;
        }
        System.out.print("Enter the number of hours :");
        int timeWorking = checkWriteStr(sc.nextLine(), 100000);
        if (num == -1) {
            System.out.println("\nYou have entered incorrect data!!!\n");
            return;
        }
        employeeList.get(num).setWorkingHours(timeWorking);
        System.out.print("Enter wage per hour :");
        int salary = checkWriteStr(sc.nextLine(), 100000);
        if (num == -1) {
            System.out.println("\nYou have entered incorrect data!!!\n");
            return;
        }
        employeeList.get(num).setSalary(salary);
    }

    static int checkWriteStr(String str, int max) {
        str = (str.replaceAll("[\\D]",""));
        if (str.equals("")) return -1;
        if (Integer.parseInt(str) >= max) return -1;
        return Integer.parseInt(str);
    }


}
