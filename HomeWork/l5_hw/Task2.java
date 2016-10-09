import java.util.Scanner;

/**
 * Created by Babajko on 08.10.2016.
 */
public class Task2 {
    public static void main(String[] args) {
        int [] myMass = new int[10];
        Scanner sc = new Scanner(System.in);

        int tmpRes;
        boolean isNegative = false;
        for (int i = 0; i < myMass.length; i++) {
            myMass[i] = sc.nextInt();
            if ((myMass[i] < 0) && (isNegative == false)) isNegative = true;
        }
        if (isNegative){
            tmpRes = 1;
            for (int i = 5; i < myMass.length; i++) {
                tmpRes = tmpRes * myMass[i];
            }
            System.out.println("Calculated the product of last 5 element = " + tmpRes);
        } else {
            tmpRes = 0;
            for (int i = 0; i < 5; i++) {
                tmpRes = tmpRes + myMass[i];
            }
            System.out.println("Calculated the sum of first 5 elements = " + tmpRes);
        }
    }
}
