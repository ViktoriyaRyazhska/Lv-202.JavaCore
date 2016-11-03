package myProject;

public abstract class KitchenAppliances extends HouseholdAppliances {

	public KitchenAppliances() {
	}

	public KitchenAppliances(String maker, String model, int year, double inputAmperage, double inputVoltage,
			boolean isTurned) {
		super(maker, model, year, inputAmperage, inputVoltage, isTurned);
	}
	

}
