import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Babajko on 24.09.2016.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double c1, c2, c3, t1, t2, t3;

        System.out.println("Enter standard unit per minute for countries");
        c1 = Double.parseDouble(br.readLine());
        c2 = Double.parseDouble(br.readLine());
        c3 = Double.parseDouble(br.readLine());

        System.out.println("Enter time talks");
        t1 = Double.parseDouble(br.readLine());
        t2 = Double.parseDouble(br.readLine());
        t3 = Double.parseDouble(br.readLine());

        System.out.println("The price c1 : " + (c1*t1));
        System.out.println("The price c2 : " + (c2*t2));
        System.out.println("The price c3 : " + (c3*t3));
        System.out.println("The total price is : " + (t1*c1 + t2*c2 +t3*c3));
    }
}
