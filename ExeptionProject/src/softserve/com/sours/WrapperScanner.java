package softserve.com.sours;

import java.util.Scanner;

public class WrapperScanner implements AutoCloseable{
	private static WrapperScanner wrapperScanner;

	private Scanner scanner = new Scanner(System.in);

	private WrapperScanner() {
	}

	public static WrapperScanner getInstance() {
		if (wrapperScanner == null) {
			wrapperScanner = new WrapperScanner();
		}
		return wrapperScanner;
	}

	public String getNextValue() {
		return scanner.nextLine();
	}
	
	public int getNextInt(){
		return scanner.nextInt();
	}
	
	public double getNextDouble(){
		return scanner.nextDouble();
	}

	@Override
	public void close() throws Exception {
		scanner.close();
	}
}
