import java.util.Scanner;

/**
 * Created by Babajko on 06.10.2016.
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int product = 1;
        int readNum;
        while ((readNum = sc.nextInt()) >= 0){
            if ((readNum%2)==0) product = product * readNum;
        }
        System.out.println("Product of all entered even numbers = " + product);
    }
}
