import java.util.Scanner;

/**
 * Created by Babajko on 26.10.2016.
 */
public class Task2 {
    public static void main(String[] args) {
        int start = 1;
        int end = 100;
        int i = 10;
        String str = "";
        while (i > 0){
            try {
                 int c = readNumber(start, end);
                if ((end - c) < i) throw new BadNumberException("This number does not satisfy the condition loop!");
                start = c;
                i--;
                str += String.valueOf(c) + " ";
                //System.out.println(c);
            } catch (OutRangeException e) {
                System.err.println(e.toString());
            } catch (BadNumberException e) {
                System.err.println(e.toString());
                System.err.println("Brake loop (y/n)");
                if ( (new Scanner(System.in).nextLine()).toLowerCase().equals("y")) break;
            } catch (Exception e) {
                e.getStackTrace();
            }
        }
        System.out.println(str);
    }

    static int readNumber(int start, int end) throws OutRangeException{
        Scanner sc = new Scanner(System.in);

        int enteredNumber = sc.nextInt();
        if ((enteredNumber <= start)|| enteredNumber >= end) throw new OutRangeException("This number does not match the range!");

        return enteredNumber;
    }
}
 class OutRangeException extends Exception{
     public OutRangeException() {
     }

     public OutRangeException(String message) {
         super(message);
     }
 }

 class BadNumberException extends Exception{
     public BadNumberException() {
     }

     public BadNumberException(String message) {
         super(message);
     }
 }