package myProject;

public class Tablet extends Electronics {
	public Tablet(){
		
	}

	public Tablet(String maker, String model, int year, double iputAmperage, double inputVoltage, boolean isTurned,
			double frequencyOfProcessor, double extentOfRAM, double memoryCapacity) {
		super(maker, model, year, iputAmperage, inputVoltage, isTurned, frequencyOfProcessor, extentOfRAM, memoryCapacity);
	}
	
	public Tablet(String maker, double frequencyOfProcessor, double extentOfRAM, double memoryCapacity){
		super(maker, frequencyOfProcessor, extentOfRAM,memoryCapacity);
	}

	@Override
	public String toString() {
		return "Tablet [maker=" + maker + ", model=" + model + "]";
	}
	
	
}
