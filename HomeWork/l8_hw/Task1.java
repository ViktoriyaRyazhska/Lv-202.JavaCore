import java.util.Scanner;

/**
 * Created by Babajko on 23.10.2016.
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter five words in one line.");
        String str = sc.nextLine().trim();
        String[] arr = str.split(" ");
        String wordMax = "";
        int countLetters = 0;
        for (String s:arr){
            if (s.length() > wordMax.length()) wordMax = s;
            countLetters += s.length();
        }
        System.out.println("The longest word\t\t\t\t\t\t\"" + wordMax + "\"\tCount letters: " + wordMax.length());
        System.out.println("Number of letters in the whole line\t\t" + countLetters);
        System.out.println("the second word in reverse order\t\t" + reversWord(arr[1]));

    }
    static String reversWord(String str){
        int i = str.length();
        String ret = new String();
        while (i > 0){
            ret += str.charAt(i-1);
            i--;
        }
        return ret;
    }
}
