package com.ss;

public class Citramon extends Analgesics {
	String name = "Citramon";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Citramon(MedicineType type, double price, int amount) {
		super(type, price, amount);

	}

}
