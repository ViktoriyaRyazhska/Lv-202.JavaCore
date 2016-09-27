import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Babajko on 24.09.2016.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String c1, c2, c3;
        int t1, t2, t3;

        System.out.println("Enter country name");
        c1 = br.readLine();
        c2 = br.readLine();
        c3 = br.readLine();

        System.out.println("Enter time talks");
        t1 = Integer.parseInt(br.readLine());
        t2 = Integer.parseInt(br.readLine());
        t3 = Integer.parseInt(br.readLine());

        System.out.println(c1 + " : " + t1);
        System.out.println(c2 + " : " + t2);
        System.out.println(c3 + " : " + t3);
        System.out.println("All time : " + (t1 + t2 +t3));
    }
}
