import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Car[] car = new Car[4];
		car[0] = new Car("hatchback", 2015, 2.1);
		car[1] = new Car("hatchback", 2016, 2.2);
		car[2] = new Car("sedan", 2015, 2.1);
		car[3] = new Car("sedan", 2016, 2.1);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter year");
		int year = Integer.parseInt(br.readLine());

		for (int i = 0; i < car.length; i++) {

			if (car[i].year == year) {
				System.out.println(car[i]);
			}
		}
		Car tmp;
		for (int i = 0; i < car.length - 1; i++) {
			for (int j = i + 1; j < car.length; j++) {
				if (car[i].year < car[j].year) {
					tmp = car[i];
					car[i] = car[j];
					car[j] = tmp;
					System.out.println();
				}
			}

		}
		for (Car cars : car) {
			
			System.out.println(cars);
		}
	}
}
