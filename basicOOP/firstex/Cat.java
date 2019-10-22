package com.freetime.exercises.basicOOP.firstex;

class Cat extends Animal implements IAnimal {

	public String speak() {
		return "miyav";
	}

	public boolean isAlive() {
		return true;
	}

	public boolean canFly() {
		return false;
	}

	public boolean canSwim() {
		return true;
	}

	public boolean hasTail() {
		return true;
	}

	public String nutrition() {
		return "carnivore";
	}
}
