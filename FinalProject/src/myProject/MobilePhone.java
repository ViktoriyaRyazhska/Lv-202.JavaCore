package myProject;

import java.util.Comparator;

public class MobilePhone extends Electronics {
	protected double megapixelsOfCamera;

	public MobilePhone() {
	}

	public MobilePhone(String maker, String model, int year, double iputAmperage, double inputVoltage, boolean isTurned,
			double frequencyOfProcessor, double extentOfRAM, double memoryCapacity, double megapixelsOfCamera) {
		super(maker, model, year, iputAmperage, inputVoltage, isTurned, frequencyOfProcessor, extentOfRAM, memoryCapacity);
		if(megapixelsOfCamera>0){
			this.megapixelsOfCamera = megapixelsOfCamera;
		} else{
			System.out.println("Invalid megapixels of camera!");
		}
		
	}
	
	public MobilePhone(String maker, double frequencyOfProcessor, double extentOfRAM, double memoryCapacity){
		super(maker, frequencyOfProcessor, extentOfRAM,memoryCapacity);
	}

	public double getMegapixelsOfCamera() {
		return megapixelsOfCamera;
	}

	public void setMegapixelsOfCamera(double megapixelsOfCamera) {
		if(megapixelsOfCamera>0){
			this.megapixelsOfCamera = megapixelsOfCamera;
		} else{
			System.out.println("Invalid megapixels of camera!");
		}
	}

	
	
	@Override
	public String toString() {
		return "MobilePhone [ maker=" + maker + ", model=" + model + "]";
	}



	static class MegapixelsOfCameraComparator implements Comparator<MobilePhone>{

		@Override
		public int compare(MobilePhone o1, MobilePhone o2) {
			return (int)Math.round(o1.megapixelsOfCamera)-(int)Math.round(o2.megapixelsOfCamera);
		}
		
	}
	
	
	

}
