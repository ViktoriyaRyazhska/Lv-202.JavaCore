package Home_Work3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1_a {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter three numbers");
		
		float number1 = Float.parseFloat(reader.readLine());
		float number2 = Float.parseFloat(reader.readLine());
		float number3 = Float.parseFloat(reader.readLine());
		
		if(number1>= -5 && number1<= 5){
			System.out.println(number1 + " belong to the range [-5,5];");
		} 
		else{System.out.println(number1 + " not belong to the range [-5,5];");}
		
		if(number2>= -5 && number2<= 5){
			System.out.println(number2 + " belong to the range [-5,5];");
		}
		else{System.out.println(number2 + " not belong to the range [-5,5];");}
		
		if(number3>= -5 && number3<= 5){
			System.out.println(number3 + " belong to the range [-5,5];");
		}
		else{System.out.println(number3 + " not belong to the range [-5,5];");}
		

	}

}
