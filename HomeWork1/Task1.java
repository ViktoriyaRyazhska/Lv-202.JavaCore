import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Please, enter radius of flower bed:");
		double radius;
		try {
			radius = Double.parseDouble(br.readLine());
			double area = 2 * Math.PI * radius;
			double perimeter = Math.PI * Math.pow(radius, 2);
			System.out.printf("Area of flower bed: %f.\nPerimeter of flower bed: %f.", area, perimeter);
		} catch (NumberFormatException | IOException e) {
			System.out.println("Enter number!!!");
		}

	}

}
