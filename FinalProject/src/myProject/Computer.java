package myProject;

public abstract class Computer extends Electronics {
	TypeOfGraphicCard graphicsType;

	public Computer() {
	}

	public Computer(String maker, String model, int year, double iputAmperage, double inputVoltage, boolean isTurned,
			double frequencyOfProcessor, double extentOfRAM, double memoryCapacity, String graphicsType) {
		super(maker, model, year, iputAmperage, inputVoltage, isTurned, frequencyOfProcessor, extentOfRAM,
				memoryCapacity);
		if (graphicsType != null) {
			switch (graphicsType) {
			case "Integrated card":
				this.graphicsType = TypeOfGraphicCard.INTEGRATED_CARD;
				break;

			case "Discrete card":
				this.graphicsType = TypeOfGraphicCard.DISCRETE_CARD;
				break;

			default:
				System.out.println("Invalid type of graphic card!");
				break;
			}

		}
	}

	public Computer(String maker, double frequencyOfProcessor, double extentOfRAM, double memoryCapacity) {
		super(maker, frequencyOfProcessor, extentOfRAM, memoryCapacity);
	}

	public TypeOfGraphicCard getGraphicsType() {
		return graphicsType;
	}

	public void setGraphicsType(String graphicsType) {
		if (graphicsType != null) {
			switch (graphicsType) {
			case "Integrated card":
				this.graphicsType = TypeOfGraphicCard.INTEGRATED_CARD;
				break;

			case "Discrete card":
				this.graphicsType = TypeOfGraphicCard.DISCRETE_CARD;
				break;

			default:
				System.out.println("Invalid type of graphic card!");
				break;
			}

		}
	}

	@Override
	public String toString() {
		return "Computer [ maker=" + maker + ", model=" + model + "]";
	}

}
