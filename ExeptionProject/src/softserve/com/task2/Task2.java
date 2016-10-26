package softserve.com.task2;

import softserve.com.sours.MyExeption;
import softserve.com.sours.WrapperScanner;

public class Task2 {
    private static final WrapperScanner SCANNER = WrapperScanner.getInstance();

    public int readNumber(int start, int end) throws MyExeption {
        System.out.println("Enter integer number");
        int a = SCANNER.getNextInt();
        if (a > start && a < end) {
            return a;
        }
        throw new MyExeption(" Your number is not in range. ");
    }
}
