package softserve.com.number;

import java.util.Scanner;

public class WrapperScanner {
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
}
