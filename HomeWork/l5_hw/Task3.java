import java.util.Scanner;

/**
 * Created by Babajko on 06.10.2016.
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] myMass = new int[5];

        System.out.println("Enter five numbers");
        for (int i = 0; i < myMass.length; i++) {
            myMass[i] = sc.nextInt();
        }
        int posSPN = 0;
        int min = myMass[0];
        int minPos = 0;
        int count = 0;
        for (int i = 0; i < myMass.length; i++) {
            if (myMass[i] < min) {
                min = myMass[i];
                minPos = i;
            }
            if((myMass[i] > 0) && (count < 2)){
                count++;
                if (count == 2) posSPN = i;
            }
        }
        if(posSPN == 0) {
            System.out.println("This number does not exist");
        }else{
            System.out.println("Position of second positive number : " + posSPN);
        }
        System.out.println( "Most minimum number : " + min);
        System.out.println("Position most minimum number : " + minPos);
    }
}
