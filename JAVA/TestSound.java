package com.ust.examples;

abstract class Animal1{
	abstract void makeSound();
}

class Dog1 extends Animal1{
	public void makeSound() {
		System.out.println("Bark Bark");
	}
}
class Cat1 extends Animal1{
	public void makeSound() {
		System.out.println("Meows");
	}
}

public class TestSound {

	public static void main(String[] args) {
		Dog1 d1 = new Dog1();
		d1.makeSound();
		Cat1 c1 = new Cat1();
		c1.makeSound();
		

	}

}
