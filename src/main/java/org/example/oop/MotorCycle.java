package org.example.oop;

public class MotorCycle extends Vehicle {

	private int seatHeight;

	private int trail;

	public MotorCycle(Long vehicleId, String model, String manufacturer, int seatHeight, int trail) throws Exception {
		super(vehicleId, model, manufacturer);

		super.checkLimit(seatHeight, "seatHeight", 0, 1000);
		super.checkLimit(trail, "trail", 0, 100);

		this.seatHeight = seatHeight;
		this.trail = trail;
	}

	public int getSeatHeight() {
		return seatHeight;
	}

	public void setSeatHeight(int seatHeight) {
		this.seatHeight = seatHeight;
	}

	public int getTrail() {
		return trail;
	}

	public void setTrail(int trail) {
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
