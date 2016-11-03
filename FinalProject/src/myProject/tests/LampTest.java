package myProject.tests;

import java.io.IOException;
import myProject.*;

public class LampTest {

	public static void main(String[] args) {
		
		Lamp l1  = new Lamp();
		try {
			System.out.println("Light ON"+"\n");
			l1.light();
		} catch (IOException e) {
			System.out.println("Unfortunately it cannot light(((");
		}
		
	}

}
