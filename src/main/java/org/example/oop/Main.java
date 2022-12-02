package org.example.oop;

public class Main {

	public static void main(String[] args) throws Exception {

		Car car = new Car(1L,
						"Stilo",
						"Fiat",
						5,
						5,
						800
		);

		car.setPower(900);
		car.setFuelCapacity(50);

		MotorCycle motorCycle = new MotorCycle(
				2L,
				"Raptor",
				"Yamaha",
				600,
				50
		);

		motorCycle.setPower(600);
		motorCycle.setFuelCapacity(11);

		System.out.println("car: " + car.getVehicle());
		System.out.println(car.getCapacity());
		System.out.println();
		System.out.println(car);

		System.out.println();
		System.out.println("motorcycle: " + motorCycle.getVehicle());
		System.out.println();
		System.out.println(motorCycle);
	}
}
