package Home_Work3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1_b {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter three integer numbers");
		
		int number1 = Integer.parseInt(reader.readLine());
		int number2 = Integer.parseInt(reader.readLine());
		int number3 = Integer.parseInt(reader.readLine());
		
		if(number1>=number2 && number1>=number3){System.out.println("The max number is "+number1);}
		if(number2>=number1 && number2>=number3){System.out.println("The max number is "+number2);}
		if(number3>=number1 && number3>=number2){System.out.println("The max number is "+number3);}
	}

}
