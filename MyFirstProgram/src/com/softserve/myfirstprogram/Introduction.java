package com.softserve.myfirstprogram;

import java.io.IOException;

public class Introduction {
	void introduce() throws IOException{
		WrapperScanner scanner = WrapperScanner.getInstance();
		System.out.println("What is your name?");
		String name = scanner.getNext();
		System.out.println("How old are you?");
		int age = scanner.getNextInt();
		System.out.println("Where do you live "+name+"?");
		String address = scanner.getNext();
		System.out.println("Your name is "+name+". You are "+age+". You live in "+address+".");
	}
}
