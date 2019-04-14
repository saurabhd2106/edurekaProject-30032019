package day5;

import day6.Car;
import day6.Machine;

public class DemoMachine {
	
	public static void main(String[] args) {
		
		
		Machine mac = new Machine();
		
		mac.start();
		
		
		
		System.out.println("--------------------------------------------");
		
		Car alto = new Car();
		
		alto.start();
		alto.accelerate();
		
		System.out.println("---------------------------------------------");
		
		Machine bmw = new Car();
		
		bmw.start();
	}

}
