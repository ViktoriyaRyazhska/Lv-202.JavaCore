package com.ss;

public class Ibuprofen extends Analgesics {
	String name = "Ibuprofen";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Ibuprofen(MedicineType type, double price, int amount) {
		super(type, price, amount);

	}

}
