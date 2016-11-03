package com.ss;

public class Persen extends Antidepressant {
	String name = "Persen";

	public Persen(MedicineType type, double price, int amount) {
		super(type, price, amount);

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
