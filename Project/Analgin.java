package com.ss;

public class Analgin extends Analgesics {
String name = "Analgin";

	public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

	public Analgin(MedicineType type, double price, int amount) {
		super(type, price, amount);

	}

}
