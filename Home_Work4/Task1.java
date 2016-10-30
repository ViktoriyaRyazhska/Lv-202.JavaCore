package Home_Work4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
	public static void main(String [] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int number;
		int [] month_days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		System.out.println("Enter the number of month");
		number = Integer.parseInt(reader.readLine());
		if(number>=1 && number<=12){
			System.out.println("Emount of days is "+month_days[number-1]);
		}
		else{System.out.println("wrong input data!");}
		
	}

}
