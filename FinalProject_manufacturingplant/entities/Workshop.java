package com.manufacturingplant.entities;

public class Workshop {

	private int workshopId;

	private String workshopName;

	private String chairman;

	public Workshop() {
	}

	public Workshop(int workshopId, String workshopName, String chairman) {
		this.workshopId = workshopId;
		this.workshopName = workshopName;
		this.chairman = chairman;
	}

	public int getWorkshopId() {
		return workshopId;
	}

	public String getWorkshopName() {
		return workshopName;
	}

	public String getChairman() {
		return chairman;
	}

	public void setWorkshopId(int workshopId) {
		this.workshopId = workshopId;
	}

	public void setWorkshopName(String workshopName) {
		this.workshopName = workshopName;
	}

	public void setChairman(String chairman) {
		this.chairman = chairman;
	}

	@Override
	public String toString() {
		return "ЦехІД " + workshopId + "; " + workshopName + "; начальник цеху -> " + chairman;
	}

}
