package com.ss;

public class Herbion extends Chill {
	String name = "Herbion";

	public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
	public Herbion(MedicineType type, double price, int amount) {
		super(type, price, amount);

	}

}
