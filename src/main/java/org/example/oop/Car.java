package org.example.oop;

public class Car extends Vehicle {

	// properties
	private int seats;

	private int doors;

	private int trunkCapacity;

	// constructors
	public Car(Long vehicleId, String model, String manufacturer, int seats, int doors, int trunkCapacity) throws Exception {
		super(vehicleId, model, manufacturer);

		// Check for limits in properties, as given in exercise
		super.checkLimit(seats, "seats",  2, 5);
		checkLimit(doors, "doors", 2, 5);
		checkLimit(trunkCapacity, "trunkCapacity", 1, 1000);

		this.seats = seats;
		this.doors = doors;
		this.trunkCapacity = trunkCapacity;
	}

	// public methods
	public String getCapacity() {
		return "The fuel capacity of this car is " + super.getFuelCapacity() + " and it's trunk capacity is " + this.trunkCapacity;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) throws Exception {
		checkLimit(seats, "seats", 2, 5);
		this.seats = seats;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) throws Exception {
		checkLimit(doors, "doors", 2, 5);
		this.doors = doors;
	}

	public float getTrunkCapacity() {
		return trunkCapacity;
	}

	public void setTrunkCapacity(int trunkCapacity) throws Exception {
		checkLimit(trunkCapacity, "trunkCapacity", 1, 1000);
		this.trunkCapacity = trunkCapacity;
	}

	@Override
	public String toString() {
		return "Car{" +
				"\n" + "\t" + super.toString() +
				"\tSeats: " + seats + "\n" +
				"\tDoors: " + doors + "\n" +
				"\tTrunkCapacity: " + trunkCapacity + "\n" +
				'}';
	}
}
