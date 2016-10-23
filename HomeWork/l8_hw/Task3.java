import java.util.Scanner;
import java.util.regex.*;

/**
 * Created by Babajko on 23.10.2016.
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter text.");
        String str = sc.nextLine().trim();
        String pattern = "\\$(\\d*)(\\.\\d{2})?";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(str);
        while (m.find()) {
            System.out.println(str
                    .substring(m.start(), m.end()));
        }

    }
}
