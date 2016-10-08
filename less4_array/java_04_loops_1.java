package java_04_loops_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class java_04_loops_1 {
	
	public static void months(int a){
		switch (a) {
		case 1:
			System.out.print("January:");
			break;
		case 2:
			System.out.print("February:");
			break;
		case 3:
			System.out.print("March:");
			break;
		case 4:
			System.out.print("April:");
			break;
		case 5:
			System.out.print("May:");
			break;
		case 6:
			System.out.print("June:");
			break;
		case 7:
			System.out.print("July:");
			break;
		case 8:
			System.out.print("August:");
			break;
		case 9:
			System.out.print("September:");
			break;
		case 10:
			System.out.print("October:");
			break;
		case 11:
			System.out.print("November:");
			break;
		case 12:
			System.out.print("December:");
			break;
		default:
			break;
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		int [] days = new int[13];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 1; i < days.length; i++) {
			System.out.print("input number months (0 exit):");
			int nom = Integer.parseInt(br.readLine());
			if(nom==0) break;
			System.out.print("input days ");
			months(nom);
			days[nom] = Integer.parseInt(br.readLine());
		}
		for (int i = 1; i < days.length; i++) {
			System.out.print("number days of month ");
			months(i);
			System.out.println(days[i]);			
		}

	}

}
