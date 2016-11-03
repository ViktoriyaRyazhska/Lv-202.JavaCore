package com.ss;

public class Abactal extends Antibiotic {
	String name = "Abactal";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Abactal(MedicineType type, double price, int amount) {
		super(type, price, amount);

	}

}
