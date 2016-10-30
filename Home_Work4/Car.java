package Home_Work4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Car implements Comparable<Car>{
	
	private String type;
	private int yearOfProduction;
	private double engineCapacity;
	
	public Car(){}
	
	public Car(String type, int yearOfProduction, double engineCapacity) {
		this.type = type;
		this.yearOfProduction = yearOfProduction;
		this.engineCapacity = engineCapacity;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getYearOfProduction() {
		return yearOfProduction;
	}
	public void setYearOfProduction(int yearOfProduction) {
		this.yearOfProduction = yearOfProduction;
	}
	public double getEngineCapacity() {
		return engineCapacity;
	}
	public void setEngineCapacity(double engineCapacity) {
		this.engineCapacity = engineCapacity;
	}

	@Override
	public String toString() {
		return "Car [type=" + type + ", yearOfProduction=" + yearOfProduction + ", engineCapacity=" + engineCapacity
				+ "]";
	}

	@Override
	public int compareTo(Car car) {
		
		return this.yearOfProduction - car.yearOfProduction;
	}

	

}
class TestCar{
public static void main(String[] args) {
	
	boolean isCar = false;
	
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	Car car1 = new Car("Lada", 1998, 1.6);
	Car car2 = new Car("Nissan", 2005, 2.0);
	Car car3 = new Car("Reno", 2000, 1.5);
	Car car4 = new Car("Jeep", 2010, 3.0);
	
	Car [] cars = {car1, car2,car3, car4};
	
	System.out.println("Enter year of car production");
	try {
		int year = Integer.parseInt(reader.readLine());
		if(year>1900){
			for(int i =0; i<cars.length; i++){
				if(cars[i].getYearOfProduction()==year){
					System.out.println(cars[i]+"\n");
					isCar = true;
				} else if(!isCar){System.out.println("There are no car with this year of production!");
				break;}
			}
		} else{System.out.println("At this time there were no cars"+"\n");}
	} catch (NumberFormatException e) {
		
		System.out.println("Number format error!");
	} catch (IOException e) {
		System.out.println("Input/output error!");
	}
	
	Arrays.sort(cars);
	System.out.println("Cars sorted by year of production "+"\n"+Arrays.toString(cars));
	
	}
}