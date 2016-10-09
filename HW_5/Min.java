package com.soft;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Min {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] numbers;
		numbers = new int[5];
		int x = 0;
		int imin = 0;

		System.out.println("Enter 5 numbers ");
		for (int i = 0; i < 5; i++) {

			numbers[i] = Integer.parseInt(br.readLine());

		}
		for (int i = 0; i < 5; i++) {
			if (numbers[i] > 0) {
				x++;
				if (x == 2) {
					System.out.println("Position of second positive numbers is " + (i + 1));
				}

			}

		}
		int min = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			
			if (numbers[i] < min) {

				min = numbers[i];
				imin = i;
			}

		}
		System.out.print("Minimum = " + min);
		System.out.println(" is in " + (imin + 1) + " place");

	}
}
