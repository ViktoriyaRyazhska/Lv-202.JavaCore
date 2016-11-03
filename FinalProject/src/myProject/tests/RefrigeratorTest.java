package myProject.tests;

import java.io.IOException;

import myProject.*;

public class RefrigeratorTest {

	public static void main(String[] args) {

		Refrigerator r1 = new Refrigerator();
		r1.setProducts("Cheese", "Olivs", "Eggs", "Butter");
		r1.getProducts();
		r1.removeProduct("Eggs");
		r1.getProducts();
		System.out.println();
		r1.removeProduct("CocaCola");

		try {
			r1.addToListOfProductsToFile();
		} catch (IOException e) {

			System.out.println("I/O error!");
		}

	}

}
