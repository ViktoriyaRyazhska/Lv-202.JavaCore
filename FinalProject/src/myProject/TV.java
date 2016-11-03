package myProject;

public class TV extends RoomEquipment {
	protected double diagonal;

	public TV() {
	}

	public TV(String maker, String model, int year, double inputAmperage, double inputVoltage, boolean isTurned,
			double diagonal) {
		super(maker, model, year, inputAmperage, inputVoltage, isTurned);
		if (diagonal >= 10) {
			this.diagonal = diagonal;
		} else {
			System.out.println("Invalid diagonal!");
		}
	}

	public double getDiagonal() {
		return diagonal;
	}

	public void setDiagonal(double diagonal) {
		if (diagonal >= 10) {
			this.diagonal = diagonal;
		} else {
			System.out.println("Invalid diagonal!");
		}
	}

	@Override
	public String toString() {
		return "TV [maker=" + maker + ", model=" + model + "]";
	}
	
	

}
