package com.ss;

public class Aleron extends Antiallergic {
	String name = "Aleron";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Aleron(MedicineType type, double price, int amount) {
		super(type, price, amount);

	}

}
