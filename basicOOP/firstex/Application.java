package com.freetime.exercises.basicOOP.firstex;


public class Application {

	public static void main(String[] args) {
		Animal animal = new Animal();
		Cat kedi = new Cat(); 
		Animal dog = new Dog();
		Animal bird = new Bird();
		kedi.setNumLegs(5);
		System.out.println(kedi.getNumLegs());
		System.out.println(kedi.nutrition());
	}
}
