
import java.util.Scanner;

/**
 * Created by Babajko on 03.10.2016.
 */
public class Main {

    private enum HTTPError{
        BAD_REQUEST,                    //400
        UNAUTHORIZED,                   //401
        PAYMENT_REQUEST,                //402
        FORBIDDEN,                      //403
        NOT_FOUND,                      //404
        METHOD_NOT_ALLOWED,             //405
        NOT_ACCEPTABLE,                 //406
        PROXY_AUTHENTICATION_REQUIRED,  //407
        REQUEST_TIMEOUT,                //408
        CONFLICT                        //409
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

                System.out.println("Enter three numbers");
                float myArray[] = new float[3];
                for (int i = 0; i < myArray.length; i++) {
                    myArray[i] = sc.nextFloat();
                }
                boolean checkRange = false;
                for (int i = 0; i < myArray.length; i++) {
                    if ((myArray[i] < -5) || (myArray[i] > 5)) {
                        System.out.println("This number does not satisfy the range : " + myArray[i]);
                        checkRange = true;
                    }
                }
                if (!checkRange) System.out.println("Are they all belong to the range");

                System.out.println("Enter three numbers");
                int max, min, readData;
                max = min = sc.nextInt();
                for (int i = 1; i < 3; i++) {
                    readData = sc.nextInt();
                    if (readData > max) max = readData;
                    if (readData < min) min = readData;
                }
                System.out.println("Max number : " + max + "   " + "Min number : " + min);

                System.out.println("Enter HTTP Error");
                switch (sc.nextInt()) {
                    case 400:
                        System.out.println("This error: " + HTTPError.BAD_REQUEST);
                        break;
                    case 401:
                        System.out.println("This error: " + HTTPError.UNAUTHORIZED);
                        break;
                    case 402:
                        System.out.println("This error: " + HTTPError.PAYMENT_REQUEST);
                        break;
                    case 403:
                        System.out.println("This error: " + HTTPError.FORBIDDEN);
                        break;
                    case 404:
                        System.out.println("This error: " + HTTPError.NOT_FOUND);
                        break;
                    case 405:
                        System.out.println("This error: " + HTTPError.METHOD_NOT_ALLOWED);
                        break;
                    case 406:
                        System.out.println("This error: " + HTTPError.NOT_ACCEPTABLE);
                        break;
                    case 407:
                        System.out.println("This error: " + HTTPError.PROXY_AUTHENTICATION_REQUIRED);
                        break;
                    case 408:
                        System.out.println("This error: " + HTTPError.REQUEST_TIMEOUT);
                        break;
                    case 409:
                        System.out.println("This error: " + HTTPError.CONFLICT);
                        break;
                    default:
                        System.out.println("This code not found");
                        break;
                }

    }
}
