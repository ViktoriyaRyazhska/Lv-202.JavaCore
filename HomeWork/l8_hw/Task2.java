import java.util.Scanner;

/**
 * Created by Babajko on 23.10.2016.
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine().trim();
        String str = "I    am      learning     Java   Core";
        System.out.println(str.replaceAll("[\\s]{2,}", " "));
    }
}
