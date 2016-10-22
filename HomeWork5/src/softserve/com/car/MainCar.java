package softserve.com.car;

public class MainCar {

	Car[] getArrayCars() {
		Car[] cars = { new Car("BMW", 1991, 2.0),
				new Car("AUDI", 2014, 2.5), 
				new Car("BMW", 1997, 2.0), 
				new Car("BMW", 2007, 2.0) 
				};
		return cars;
	}

	void serchCar(int year) {
		for (int i = 0; i < getArrayCars().length; i++) {
			if (getArrayCars()[i].getYearOfProduction() == year) {
				System.out.println(getArrayCars()[i]);
			}
		}
	}

	public Car[] sortCar(Car[] carss) {
		Car tmp;
		for (int i = 0; i < carss.length - 1; i++) {
			for (int j = i + 1; j < carss.length; j++) {
				if (carss[i].getYearOfProduction() > carss[j].getYearOfProduction()) {
					tmp = carss[i];
					carss[i] = carss[j];
					carss[j] = tmp;
				}
			}
		}

		return carss;
	}

	public static void main(String[] args) {
		// Arrays.sort(cars);
		MainCar car = new MainCar();
		car.serchCar(1991);
		Car[] cars = car.sortCar(car.getArrayCars());
		
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}

	}
}
