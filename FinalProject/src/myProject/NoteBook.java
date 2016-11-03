package myProject;

public class NoteBook extends Computer {

	public NoteBook() {
	
	}

	public NoteBook(String maker, String model, int year, double iputAmperage, double inputVoltage, boolean isTurned,
			double frequencyOfProcessor, double extentOfRAM, double memoryCapacity, String graphicsType) {
		super(maker, model, year, iputAmperage, inputVoltage, isTurned, frequencyOfProcessor, extentOfRAM, memoryCapacity,
				graphicsType);
	}
	
	public NoteBook(String maker, double frequencyOfProcessor, double extentOfRAM, double memoryCapacity){
		super(maker, frequencyOfProcessor, extentOfRAM,memoryCapacity);
	}

	@Override
	public String toString() {
		return "NoteBook [ maker=" + maker + ", model=" + model +  "]";
	}
	
	
	
}
