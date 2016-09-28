package com.softserve.myfirstprogram;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		//1
		WrapperScanner scanner = WrapperScanner.getInstance();
		FlowerBed flowerBed = new FlowerBed();
		System.out.println("Input radius.");
		double radius = scanner.getNextDouble();
		System.out.println("Flower bed's area is - "+flowerBed.getArea(radius));
		System.out.println("Flower bed's perimeter is - "+flowerBed.getPerimeter(radius));
		
		//2
		Introduction introduction = new Introduction();
		introduction.introduce();
		
		//3
		Calls calls = new Calls();
		System.out.println("Input talks continued c1");
		int t1 = scanner.getNextInt();
		System.out.println("Input talks continued c2");
		int t2 = scanner.getNextInt();
		System.out.println("Input talks continued c3");
		int t3 = scanner.getNextInt();
		calls.separateCall(t1, t2, t3);
		System.out.println("All talk together - "+ calls.getAllTalkTogether(t1, t2, t3));
	}

}
