package com.ss;

public class Azitrocs extends Antibiotic {
String name = "Azitrocs";

	public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

	public Azitrocs(MedicineType type, double price, int amount) {
		super(type, price, amount);
	
	}

}
