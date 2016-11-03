package com.ss;

public abstract class Medicine  {
	@Override
	public String toString() {
		return "[type=" + type + ", price=" + price + ", amount=" + amount + "]";
	}

	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	MedicineType type;
	double price;
	int amount;

	public Medicine(MedicineType type, double price, int amount) {

		this.type = type;
		this.price = price;
		this.amount = amount;
	}

	public MedicineType getType() {
		return type;
	}

	public void setType(MedicineType type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
}
