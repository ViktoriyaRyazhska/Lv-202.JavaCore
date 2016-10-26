/**
 * Created by Babajko on 26.10.2016.
 */
public class Task1 {
    public static void main(String[] args) {
        try {
            System.out.println(div(12, 0));
        } catch (MyException e) {
            System.err.println(e.toString());
        }

        try {
            System.out.println(div(12, 4));
        } catch (MyException e) {
            System.err.println(e.toString());
        }
    }
    static double div(double a, double b) throws MyException {
        if (b == 0) throw new MyException("Division by zero!");
        return a/b;
    }
}

class MyException extends Exception {
    public MyException() {
    }

    public MyException(String str) {
        super(str);
    }
}
