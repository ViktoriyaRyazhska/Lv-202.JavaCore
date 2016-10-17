package Home_Work1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {

	public static void main(String[] args) throws IOException
	{
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));	
	
	double c1;
	double c2;
	double c3;
	
	double t1;
	double t2;
	double t3;
	
	System.out.println("Enter standard unit per minute for first country");
	c1 = Double.parseDouble(reader.readLine());
	
	System.out.println("Enter standard unit per minute for second country");
	c2 = Double.parseDouble(reader.readLine());
	
	System.out.println("Enter standard unit per minute for third country");
	c3 = Double.parseDouble(reader.readLine());
	
	System.out.println("Enter duration of first call");
	t1 = Double.parseDouble(reader.readLine());
	
	System.out.println("Enter duration of second call");
	t2 = Double.parseDouble(reader.readLine());
	
	System.out.println("Enter duration of third call");
	t3 = Double.parseDouble(reader.readLine());
	
	System.out.println("The price of first call is "+(c1*t1));
	System.out.println("The price of second call is "+(c2*t2));
	System.out.println("The price of third call is "+(c3*t3));
	System.out.println("The total price is "+((c1*t1)+(c2*t2)+(c3*t3)));
	

	}

}
