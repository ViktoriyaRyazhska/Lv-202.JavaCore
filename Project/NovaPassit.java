package com.ss;

public class NovaPassit extends Antidepressant {
	String name = "NovaPassit";

	public NovaPassit(MedicineType type, double price, int amount) {
		super(type, price, amount);

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
