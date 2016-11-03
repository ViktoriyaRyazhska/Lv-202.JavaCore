
package myProject;

/**
 * An abstract class HouseholdAppliances describes the essence of home appliances
 * 
 * @version  1.01 02.11.16 
 * @author  Andrea Mahun
 * 
 */

import java.time.Year;

public abstract class HouseholdAppliances implements Comparable<HouseholdAppliances> {

	protected String maker;
	protected String model;
	protected int year;
	protected double inputAmperage;
	protected double inputVoltage;
	protected boolean isTurned;

	/**
	 * Default constructor
	 */

	public HouseholdAppliances() {
	}
	
	/**
	 * Constructor with parameters
	 * 
	 * @param maker Maker of household appliances
	 * @param model of household appliances
	 * @param year the year of production
	 * @param inputAmperage indicates input amperage of household appliances
	 * @param inputVoltage indicates input voltage of household appliances
	 * @param isTurned indicates whether equipment is on
	 * 
 	 */
	
	public HouseholdAppliances(String maker, String model, int year, double inputAmperage, double inputVoltage,
			boolean isTurned) {
		this.maker = maker;
		this.model = model;
		if ((year > 1940) && (year <= Year.now().getValue())) {
			this.year = year;
		} else {
			System.out.println("Invalid year!");
		}
		if ((inputAmperage >= 0) && (inputVoltage >= 0)) {
			this.inputAmperage = inputAmperage;
			this.inputVoltage = inputVoltage;
		} else {
			System.out.println("Invalid iput Amperage/input Voltage!");
		}
		this.isTurned = isTurned;
	}
	
	/**
	 * Method setIsTurnedSeveralTechnique allows to set ON or OFF  a some a number of technique
	 * 
	 * @param isTurned if true the technique is ON, if false the technique is OFF
	 * @param techniques Some techniques which will be turned or unturned
	 * 
	 * 
 	 */
	
	public static void setIsTurnedSeveralTechnique(boolean isTurned, HouseholdAppliances... techniques) {
		for (HouseholdAppliances technique : techniques) {
			technique.setIsTurned(isTurned);
		}
	}
	

	
	public String getMaker() {
		return maker;
	}
	
	
	public void setMaker(String maker) {
		this.maker = maker;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if ((year > 1940) && (year <= Year.now().getValue())) {
			this.year = year;
		} else {
			System.out.println("Invalid year!");
		}
	}

	public double getInputAmperage() {
		return inputAmperage;
	}

	public void setInputAmperage(double inputAmperage) {
		if (inputAmperage >= 0) {
			this.inputAmperage = inputAmperage;
		} else {
			System.out.println("Invalid iput Amperage!");
		}
	}

	public double getInputVoltage() {
		return inputVoltage;
	}

	public void setInputVoltage(double inputVoltage) {
		if (inputVoltage >= 0) {
			this.inputVoltage = inputVoltage;
		} else {
			System.out.println("Invalid input Voltage!");
		}
	}

	public boolean getIsTurned() {
		return isTurned;
	}

	public void setIsTurned(boolean isTurned) {
		this.isTurned = isTurned;
	}

	public double calculatePower() {
		return inputVoltage * inputAmperage;
	}

	@Override
	public String toString() {
		return "HouseholdAppliances [model=" + model + ", year=" + year + ", inputAmperage=" + inputAmperage
				+ ", inputVoltage=" + inputVoltage + ", isTurned=" + isTurned + "]";
	}

	@Override
	public int compareTo(HouseholdAppliances o) {
		return (int) this.calculatePower() - (int) o.calculatePower();

	}

}
