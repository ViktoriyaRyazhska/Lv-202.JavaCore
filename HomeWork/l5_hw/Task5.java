import java.util.Scanner;

/**
 * Created by Babajko on 09.10.2016.
 */
public class Task5 {
    public static void main(String[] args) {
        Car [] cars = new Car[4];
        cars[0] = new Car("BMW", 2010, 1.7f);
        cars[1] = new Car("Toyota", 2015, 1.6f);
        cars[2] = new Car("Kia", 2016, 1.4f);
        cars[3] = new Car("Ford", 2015, 1.8f);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year of production cars");
        int yearProd = sc.nextInt();

        for (Car car:cars) {
            if (car.getYearProduction() == yearProd)
                System.out.println(car);
        }
        System.out.println();
        Car car;
        for (int i = 0; i < cars.length ; i++) {
            for (int j = i + 1; j < cars.length; j++) {
                if (cars[i].getYearProduction() > cars[j].getYearProduction()) {
                    car = cars[i];
                    cars[i] = cars[j];
                    cars[j] = car;
                }
            }
            System.out.println(cars[i]);
        }
    }
}
