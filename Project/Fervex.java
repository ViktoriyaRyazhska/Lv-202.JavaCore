package com.ss;

public class Fervex extends Chill {
	String name = "Fervex";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Fervex(MedicineType type, double price, int amount) {
		super(type, price, amount);

	}

}
