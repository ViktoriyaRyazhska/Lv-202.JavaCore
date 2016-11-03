package myProject;

public abstract class RoomEquipment extends HouseholdAppliances {

	public RoomEquipment() {
		super();

	}

	public RoomEquipment(String maker, String model, int year, double inputAmperage, double inputVoltage,
			boolean isTurned) {
		super(maker, model, year, inputAmperage, inputVoltage, isTurned);

	}

}
