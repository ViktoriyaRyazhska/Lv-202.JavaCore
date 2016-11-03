package myProject;

import java.util.Comparator;

public abstract class Electronics extends HouseholdAppliances {

	protected double frequencyOfProcessor;
	protected double extentOfRAM;
	protected double memoryCapacity;

	public Electronics() {
	}

	public Electronics(String maker, String model, int year, double iputAmperage, double inputVoltage, boolean isTurned,
			double frequencyOfProcessor, double extentOfRAM, double memoryCapacity) {
		super(maker, model, year, iputAmperage, inputVoltage, isTurned);

		if (frequencyOfProcessor > 0) {
			this.frequencyOfProcessor = frequencyOfProcessor;
		} else {
			System.out.println("Invalid frequency of processor!");
		}

		if (extentOfRAM > 0) {
			this.extentOfRAM = extentOfRAM;
		} else {
			System.out.println("Invalid frequency of extent of RAM!");
		}

		if (memoryCapacity > 0) {
			this.memoryCapacity = memoryCapacity;
		} else {
			System.out.println("Invalid  hard drive capacity!");
		}

	}
	
	public Electronics(String maker, double frequencyOfProcessor, double extentOfRAM, double memoryCapacity){
		this.maker = maker;
		if (frequencyOfProcessor > 0) {
			this.frequencyOfProcessor = frequencyOfProcessor;
		} else {
			System.out.println("Invalid frequency of processor!");
		}

		if (extentOfRAM > 0) {
			this.extentOfRAM = extentOfRAM;
		} else {
			System.out.println("Invalid frequency of extent of RAM!");
		}

		if (memoryCapacity > 0) {
			this.memoryCapacity = memoryCapacity;
		} else {
			System.out.println("Invalid  hard drive capacity!");
		}
	}

	public double getFrequencyOfProcessor() {
		return frequencyOfProcessor;
	}

	public void setFrequencyOfProcessor(double frequencyOfProcessor) {
		if (frequencyOfProcessor > 0) {
			this.frequencyOfProcessor = frequencyOfProcessor;
		} else {
			System.out.println("Invalid frequency of processor!");
		}
	}

	public double getExtentOfRAM() {
		return extentOfRAM;
	}

	public void setExtentOfRAM(double extentOfRAM) {
		if (extentOfRAM > 0) {
			this.extentOfRAM = extentOfRAM;
		} else {
			System.out.println("Invalid frequency of extent of RAM!");
		}
	}

	public double getMemoryCapacity() {
		return memoryCapacity;
	}

	public void setMemoryCapacity(double memoryCapacity) {
		if (memoryCapacity > 0) {
			this.memoryCapacity = memoryCapacity;
		} else {
			System.out.println("Invalid  hard drive capacity!");
		}

	}

	@Override
	public String toString() {
		return "Electronics [frequencyOfProcessor=" + frequencyOfProcessor + ", extentOfRAM=" + extentOfRAM
				+ ", hardDriveCapacity=" + memoryCapacity + ", model=" + model + ", year=" + year
				+ ", inputAmperage=" + inputAmperage + ", inputVoltage=" + inputVoltage + ", isTurned=" + isTurned
				+ "]";
	}

	public static class FrequencyOfProcessorComparator implements Comparator<Electronics> {

		@Override
		public int compare(Electronics o1, Electronics o2) {
			//return (int) Math.round(o1.frequencyOfProcessor) - (int) Math.round(o2.frequencyOfProcessor);
			return (int)(o1.frequencyOfProcessor*100)-(int)(o2.frequencyOfProcessor*100);
		}

	}

	public static class ExtentOfRAMComparator implements Comparator<Electronics> {

		@Override
		public int compare(Electronics o1, Electronics o2) {
			return (int)o1.extentOfRAM - (int)o2.extentOfRAM;
		}

	}
	
	public static class MemoryCapacityComparator implements Comparator<Electronics>{

		@Override
		public int compare(Electronics o1, Electronics o2) {
			return (int) Math.round(o1.memoryCapacity) - (int) Math.round(o2.memoryCapacity);
		}
		
	}

}
