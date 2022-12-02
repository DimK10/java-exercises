package org.example.oop;

public class Vehicle {

	// properties
	private Long vehicleId;

	private String model;

	private String manufacturer;

	private int power;

	private int fuelCapacity;

	// constructors
	public Vehicle(Long vehicleId, String model, String manufacturer) {
		this.vehicleId = vehicleId;
		this.model = model;
		this.manufacturer = manufacturer;
	}


	// protected methods
	protected void checkLimit(int value, String propertyName, int minimum, int maximum) throws Exception {
		if (value > maximum || value < minimum) {
			throw new Exception("The number of " + propertyName + " can only be between " + minimum + " and " + maximum + ". Number given: " + value);
		}
	}

	// public methods
	public String getVehicle() {
		return this.manufacturer + " " + this.model;
	}

	public Long getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(Long vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getFuelCapacity() {
		return fuelCapacity;
	}

	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}

	@Override
	public String toString() {
		return "Vehicle{" +
				"\n\t\tID Number: " + vehicleId + "\n" +
				"\t\tManufacturer: " + manufacturer + "\n" +
				"\t\tModel: " + model + "\n" +
				"\t\tPower: " + power + "\n" +
				"\t\tFuel capacity: " + fuelCapacity + "\n" +
				"\t}";
	}
}
