package java_04_loops_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Car_main {

	public static void main(String[] args) throws NumberFormatException, IOException {
	
		Car[] cars = new Car[4];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < cars.length; i++) {
			cars[i]=new Car();
			System.out.print("input year of production:");
			cars[i].setYear(Integer.parseInt(br.readLine()));
			System.out.print("input engine capacity: ");
			cars[i].setEngine(Integer.parseInt(br.readLine()));
		}
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
		
		System.out.print("enter year car:");
		int year_console;
		year_console=Integer.parseInt(br.readLine());
		for (int i = 0; i < cars.length; i++) {
			if(cars[i].getYear()==year_console){
			System.out.println(cars[i]);
			}
		}
		
		System.out.println("___________________________________________");
		Car temp = new Car();
		for (int i = 0; i < cars.length-1; i++) {
			for (int j = i+1; j < cars.length; j++) {
				if(cars[i].getYear()>cars[j].getYear()){
					temp=cars[i];
					cars[i]=cars[j];
					cars[j]=temp;
				}
			}
		}
		
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
	}

}
