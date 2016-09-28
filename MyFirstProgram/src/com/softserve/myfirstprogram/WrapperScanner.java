package com.softserve.myfirstprogram;

import java.io.IOException;
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

	public int getNextInt() throws IOException {
		if (!scanner.hasNextInt()) {
			scanner.next();
			throw new IOException("Invalid input date!");
		}
		return scanner.nextInt();
	}

	public double getNextDouble() throws IOException {
		if (!scanner.hasNextDouble()) {
			scanner.next();
			throw new IOException("Invalid input date!");
		}
		return scanner.nextDouble();
	}

	public String getNextValue() throws IOException {
		if (!scanner.hasNextLine()) {
			scanner.next();
			throw new IOException("Invalid input date!");
		}
		return scanner.nextLine();
	}

	public String getNext() {
		return scanner.next();
	}

	public boolean hasNext() {
		return scanner.hasNext();
	}

}
