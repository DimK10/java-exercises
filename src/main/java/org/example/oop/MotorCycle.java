package org.example.oop;

public class MotorCycle extends Vehicle {

	// properties
	private int seatHeight;

	private int trail;

	// constructors
	public MotorCycle(Long vehicleId, String model, String manufacturer, int seatHeight, int trail) throws Exception {
		super(vehicleId, model, manufacturer);

		super.checkLimit(seatHeight, "seatHeight", 0, 1000);
		super.checkLimit(trail, "trail", 0, 100);

		this.seatHeight = seatHeight;
		this.trail = trail;
	}

	// public methods
	public int getSeatHeight() {
		return seatHeight;
	}

	public void setSeatHeight(int seatHeight) throws Exception {
		super.checkLimit(seatHeight, "seatHeight", 0, 1000);
		this.seatHeight = seatHeight;
	}

	public int getTrail() {
		return trail;
	}

	public void setTrail(int trail) throws Exception {
		super.checkLimit(trail, "trail", 0, 100);
		this.trail = trail;
	}

	@Override
	public String toString() {
		return "MotorCycle{" +
				"\n" + "\t" + super.toString() + "\n" +
				"\tSeatHeight: " + seatHeight + "\n" +
				"\tTrail: " + trail + "\n" +
				"} ";
	}
}
