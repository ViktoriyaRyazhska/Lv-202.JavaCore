package jl1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	  public static void main(String[] args) throws IOException  {
		    BufferedReader br = new BufferedReader(
			new InputStreamReader(System.in));

		System.out.println("A:");
		int argA = Integer.parseInt(br.readLine());
		//System.out.print("");
		System.out.println("B:");
		int argB = Integer.parseInt(br.readLine());
		
		
		//System.out.println("How old are you?");
		//int age = Integer.parseInt(br.readLine());

		System.out.println("a+b=" + (argA + argB));  
		System.out.println("a-b=" + (argA - argB));  
		System.out.println("a*b=" + (argA * argB));  
		System.out.println("a/b=" + (argA / argB));  
		//System.out.println("You are " + age);
		
		System.out.println("How are you?");  
		String name = br.readLine();
		System.out.println("You are " + name);
		  }

}
