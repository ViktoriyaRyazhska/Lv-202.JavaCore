package com.ss;

public class Farmacitron extends Chill {
	String name = "Farmacitron";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Farmacitron(MedicineType type, double price, int amount) {
		super(type, price, amount);

	}

}
