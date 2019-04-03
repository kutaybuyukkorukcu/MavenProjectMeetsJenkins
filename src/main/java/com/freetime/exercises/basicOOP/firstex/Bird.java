package com.freetime.exercises.basicOOP.firstex;

class Bird extends Animal implements IAnimal {

	public String speak() {
		return "cik";
	}

	public boolean isAlive() {
		return true;
	}

	public boolean canFly() {
		return true;
	}

	public boolean canSwim() {
		return false;
	}

	public boolean hasTail() {
		return false;
	}

	public String nutrition() {
		return "herbivore";
	}
}
