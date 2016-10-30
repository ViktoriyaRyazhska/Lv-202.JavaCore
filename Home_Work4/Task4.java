package Home_Work4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4 {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter numbers");

		int product = 1;
		
		try{
		while (true) {
			int n;

			n = Integer.parseInt(reader.readLine());
			if (n < 0) {
				System.out.println("The productof even numbers is "+product);
				break;
			}
			if ((n % 2) == 0) {
				product = product * n;
			}
		}
		} catch(NumberFormatException | IOException e){
			System.out.println("Error");
		}
	}
}