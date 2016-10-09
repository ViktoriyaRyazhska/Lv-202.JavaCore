import java.util.Scanner;

/**
 * Created by Babajko on 06.10.2016.
 */
public class Month {
    static private int[] months = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    static int searchMonth(int month){
        return months[month-1];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of month");
        int month = sc.nextInt();
        if ((month <= 0)||(month > 12)){
            System.out.println("Incorrect number");
        }else{
            System.out.println(searchMonth(month));
        }
    }
}
