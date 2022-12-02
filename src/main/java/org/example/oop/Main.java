package org.example.oop;

public class Main {

	public static void main(String[] args) throws Exception {

		Car car = new Car(1L,
						"Fiat Stilo",
						"Fiat",
						5,
						5,
						800
		);

		car.setPower(900);
		car.setFuelCapacity(50);

		MotorCycle motorCycle = new MotorCycle(
				2L,
				"Yamaha Raptor",
				"Yamaha",
				500,
				50
		);

		motorCycle.setPower(600);
		motorCycle.setFuelCapacity(11);

		System.out.println(car);
		System.out.println(motorCycle);
	}
}
