package Home_Work4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		boolean isNegative=false;
		int [] numbers = new int[10];
		
		System.out.println("Enter ten integer numbers");
		
		for(int i =0;i<numbers.length; i++){
			numbers[i] = Integer.parseInt(reader.readLine());
		}
		
		for(int i =0;i<5; i++){	
			if(numbers[i]<0){
				isNegative = true;
			}
		}
		
		int sum = 0;
		int product =1;
		
		if(!isNegative){
			for(int i = 0; i<5; i++){
				sum+=numbers[i];
			}
			System.out.println("The sum of first 5 numbers is: "+sum);
		}
		else{
			for(int i = 5;i<10;i++){
				product = product*numbers[i];
			}
			System.out.println("The product of last 5 numbers is: "+product);
		}
		
		
		
			
	}

}
