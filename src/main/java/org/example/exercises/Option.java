package org.example.exercises;

public enum Option {

	CHARGE(1), SUM(2), EXIT(3);

	private final int value;

	Option(int value) {
		this.value = value;
	}

	public int value() {
		return value;
	}
}
