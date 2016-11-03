package com.ss;

public class Loratadin extends Antiallergic {
String name = "Laratadin";
	public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
	public Loratadin(MedicineType type, double price, int amount) {
		super(type, price, amount);

	}

}
