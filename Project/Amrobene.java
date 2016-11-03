package com.ss;

public class Amrobene extends Chill {
	String name = "Ambrobene";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Amrobene(MedicineType type, double price, int amount) {
		super(type, price, amount);

	}

}
