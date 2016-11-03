package com.ss;

public class Servont extends Chill {
	String name = "Servont";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Servont(MedicineType type, double price, int amount) {
		super(type, price, amount);

	}

}
