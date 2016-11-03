package myProject;

import java.util.ArrayList;

public class Apartment {
	protected ArrayList<HouseholdAppliances> techniques = new ArrayList<>();

	private double totalEnergy = 0;

	public Apartment() {
	}

	public Apartment(ArrayList<HouseholdAppliances> techniques, double time) throws TimeException {
		super();
		this.techniques = techniques;

	}

	public void getTechniques() {
		System.out.println("There are in apartment:" + "\n");
		if (techniques.size() > 0) {
			for (HouseholdAppliances technique : techniques) {
				System.out.println(technique.toString());
			}
		} else {
			System.out.println("No one technique");
		}
	}

	public void setTechniques(HouseholdAppliances... technique) {
		for (int i = 0; i < technique.length; i++) {
			techniques.add(technique[i]);
		}

	}

	public double getTotalEnergy() {
		return totalEnergy;
	}

	public void setTotalEnergy(double totalEnergy) {
		this.totalEnergy = totalEnergy;

	}

	public double totalEnergyUsed(double hours) throws TimeException {
		if (hours > 0) {
			for (HouseholdAppliances technique : techniques) {
				if (technique.getIsTurned() == true) {
					totalEnergy += (technique.calculatePower() * hours);
				}
			}
			return totalEnergy / 1000;
		} else
			throw new TimeException("Time cannot be negative!");

	}

}
