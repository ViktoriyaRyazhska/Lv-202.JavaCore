package Home_Work1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {

	public static void main(String[] args) throws IOException{
		String name;
		String address;
		int age;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("What is your name?");
		name = reader.readLine();
		System.out.println("Where are you live, "+name+"?");
		address = reader.readLine();
		System.out.println("What is your age, "+name+"?");
		age = Integer.parseInt(reader.readLine());
		
		System.out.println("Your name is: "+name);
		System.out.println("You are: "+age);
		System.out.println("Your address is: "+address);
		
	}

}
