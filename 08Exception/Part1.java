package Exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Part1 {

	static double  div (double a, double b){
		return a*b;
	}
	
	static double inputMethod(){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter number: ");
		double num;
		try {
			num = Double.parseDouble(br.readLine());
		} catch (NumberFormatException e) {
			System.out.println("Bad number format, try again");
			num = inputMethod();
		} catch (IOException e) {
			System.out.println("Input error, try again");
			num = inputMethod();
		}
		return num;
	}
	
	static double product(double a, double b){
		return a*b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double a, b;
		a = inputMethod();
		b = inputMethod();
		System.out.println("Result : "+ product(a,b));
	}

}
