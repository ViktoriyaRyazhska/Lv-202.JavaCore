package hw8;

import java.util.Scanner;

public class WScanner {
	private static WScanner wScanner;
	 
	 	private Scanner scanner = new Scanner(System.in);
	 
	 	private WScanner() {
	 	}
	 
	 	public static WScanner getInstance() {
	 		if (wScanner == null) {
	 			wScanner = new WScanner();
	 		}
	 		return wScanner;
	 	}
	 
	 	public String getNextValue() {
	 		return scanner.nextLine();
	 	}
	 	
	 	public int getNextInt(){
	 		return scanner.nextInt();
	 	}
	
}
