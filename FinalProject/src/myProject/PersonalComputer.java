package myProject;

public class PersonalComputer extends Computer {

	public PersonalComputer() {
		
	}

	public PersonalComputer(String maker, String model, int year, double iputAmperage, double inputVoltage,
			boolean isTurned, double frequencyOfProcessor, double extentOfRAM, double memoryCapacity,
			String graphicsType) {
		super(maker, model, year, iputAmperage, inputVoltage, isTurned, frequencyOfProcessor, extentOfRAM, memoryCapacity,
				graphicsType);
	}
	
	public PersonalComputer(String maker, double frequencyOfProcessor, double extentOfRAM, double memoryCapacity){
		super(maker, frequencyOfProcessor, extentOfRAM, memoryCapacity);
	}
	
	
		
}
