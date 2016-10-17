package Home_Work1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Task1 {

	public static void main(String[] args) throws IOException{
		double radius;
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the radius");
		radius = Double.parseDouble(reader.readLine());
		if(radius>=0)
		{
			System.out.println("The perimeter is: "+ (2*Math.PI*radius));
			System.out.println("The area is: "+ (Math.PI*radius*radius));
		}else{System.out.println("Entered number is negative!");}
		
	}

}
