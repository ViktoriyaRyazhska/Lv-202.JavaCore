import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Math.PI;

/**
 * Created by Babajko on 24.09.2016.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter radius");
        Double r = Double.parseDouble(br.readLine());
        double p = 2 * PI * r;
        double area = PI * Math.pow(r, 2);
        System.out.println("Perimeter = " + p);
        System.out.println("Area = " + area);
    }
}
