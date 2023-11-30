package edu.kvg.hostel.bean;

import java.io.Serializable;

public class Hostel implements Serializable {
	private String hostelName;
	private int roomNumber;
	private int numberOfPeople;
	private String wardenName;
	private int fees;
	private String foodAvailability;
	private String hotWaterAvailability;

	@Override
	public String toString() {
		return "Hostel    \nhostelName=" + hostelName + ",\n roomNumber=" + roomNumber + ",\n numberOfPeople="
				+ numberOfPeople + ",\n wardenName=" + wardenName + ",\n fees=" + fees + ",\n foodAvailability="
				+ foodAvailability + ",\n hotWaterAvailability=" + hotWaterAvailability + "";
	}

	public String getFoodAvailability() {
		return foodAvailability;
	}

	public void setFoodAvailability(String foodAvailability) {
		this.foodAvailability = foodAvailability;
	}

	public String getHotWaterAvailability() {
		return hotWaterAvailability;
	}

	public void setHotWaterAvailability(String hotWaterAvailability) {
		this.hotWaterAvailability = hotWaterAvailability;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getHostelName() {
		return hostelName;
	}

	public void setHostelName(String hostelName) {
		this.hostelName = hostelName;
	}

	public int getNumberOfPeople() {
		return numberOfPeople;
	}

	public void setNumberOfPeople(int numberOfPeople) {
		this.numberOfPeople = numberOfPeople;
	}

	public String getWardenName() {
		return wardenName;
	}

	public void setWardenName(String wardenName) {
		this.wardenName = wardenName;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

}
