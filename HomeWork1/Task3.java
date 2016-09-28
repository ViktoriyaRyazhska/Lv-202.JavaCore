import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {

	public static void main(String[] args) throws IOException {
		double total_price = 0;
		double price = 0;
		for (int i = 1; i <= 3; i++) {
			price = calculateCall(i);
			System.out.printf("Price of call ¹%d - %.2f\n", i, price);
			total_price += price;
		}
		System.out.printf("Total price: %.2f", total_price);
	}

	private static double calculateCall(int call) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.printf("Please, enter standart unit per minute of call ¹%d:\n", call);
		double price = Double.parseDouble(br.readLine());
		System.out.printf("Please, enter duration of call ¹%d:\n", call);
		int duration = Integer.parseInt(br.readLine());
		return price * duration;
	}
}
