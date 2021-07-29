package com.ust.examples;
// Final example
    class Vehicle1{
	int x = 5;
	Vehicle1(){
		System.out.println("Vehicle class constructor");
	}
	//final void changeGear() {
		//System.out.println("automatic variant");
	//}
	void changeGear() {
		System.out.println("automatic variant");
	}
	
}

class Honda1 extends Vehicle1{
		//void changeGear1() {
		//System.out.println("automatic variant in subclass");
		//super.changeGear();
	//}
	void changeGear() {
		System.out.println("automatic variant in subclass");
	}
	

}


public class TestFinal {

	public static void main(String[] args) {
		Vehicle v = new Honda();
		Vehicle1 v1 = new Vehicle1();
		
		v1.changeGear();
	System.out.println(v.x);
		v.changeGear();
	
	
	}

}
