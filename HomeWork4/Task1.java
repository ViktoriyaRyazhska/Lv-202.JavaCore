import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		byte[] days = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int[] numbers = { 4, 6, 1, 8, 3, 8, 3, 9, 1, 7 };
		int[] numbers2 = { 2, -1, 9, 3, 5 };
		Car[] cars = { new Car("BMW", 2015, 1600), new Car("Opel", 2004, 2000), new Car("Jeep", 2008, 3500),
				new Car("Zaz", 2004, 1600)

		};
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Task 1:\nPlease, enter number of month(1-12):");
		byte month = Byte.parseByte(br.readLine());
		System.out.println(month + " month has " + days[month - 1] + " days.");
		System.out.println("\nTask 2:");
		for (int num : numbers)
			System.out.print(num + "\t");
		int sum = 0;
		int prod = 1;
		for (int i = 0; i < 5; i++) {
			if (numbers[i] > 0) {
				sum += numbers[i];
				if (i == 4) {
					System.out.println("\nSum of 1-5: " + sum);
				}
			} else {
				for (int j = 5; j < 10; j++)
					prod *= numbers[j];
				System.out.println("\nProduct of 6-10: " + prod);
				break;
			}
		}
		System.out.println("\nTask 3:");
		for (int num : numbers2)
			System.out.print(num + "\t");
		int count = 0;
		for (int i = 0; i < numbers2.length; i++) {
			if (numbers2[i] > 0) {
				count++;
				if (count == 2) {
					System.out.println("\nPosition of second positive number is " + i + ".");
					break;
				}
			}
		}
		int min = numbers2[0];
		int imin = 0;
		for (int i = 1; i < numbers2.length; i++) {
			if (min > numbers2[i]) {
				min = numbers2[i];
				imin = i;
			}
		}
		System.out.printf("Position of min element is %d. min = %d.\n", imin, min);
		System.out.println("\nTask 4:");
		int prod2 = 1;
		int el;
		do {
			System.out.println("Please, enter number:");
			el = Integer.parseInt(br.readLine());
			if ((el % 2 == 0) && (el != 0))
				prod2 *= el;

		} while (el >= 0);
		System.out.println("Product of even numbers which were entered: " + prod2);
		System.out.println("\nTask 5:");
		for (int i = 0; i < cars.length; i++)
			System.out.println(cars[i]);
		System.out.println("Please, enter year:");
		int year = Integer.parseInt(br.readLine());
		for (int i = 0; i < cars.length; i++) {
			if (cars[i].getYear() == year) {
				System.out.println(cars[i]);
			}
		}
		Car tmp;
		for (int i = 0; i < cars.length - 1; i++)
			for (int j = i + 1; j < cars.length; j++)
				if (cars[i].getYear() > cars[j].getYear()) {
					tmp = cars[i];
					cars[i] = cars[j];
					cars[j] = tmp;
				}
		System.out.println("Ordered cars:");
		for (int i = 0; i < cars.length; i++)
			System.out.println(cars[i]);
	}

}

class Car {
	private String type;
	private int year;
	private int engine;

	public Car(String type, int year, int engine) {
		this.type = type;
		this.year = year;
		this.engine = engine;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getEngine() {
		return engine;
	}

	public void setEngine(int engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [type=" + type + ", year=" + year + ", engine=" + engine + "]";
	}

}
