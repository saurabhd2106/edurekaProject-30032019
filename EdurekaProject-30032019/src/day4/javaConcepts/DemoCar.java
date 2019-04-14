package day4.javaConcepts;

public class DemoCar {

	public static void main(String[] args) {
	
		Machine mac = new Machine(1000);
		
		mac.start();
		
		mac.stop();
		
		mac.restart();
		
		//----------------------------------------------------------
		System.out.println("----------------------------------------------");
		
		Car alto = new Car();
		
		alto.start();
		
		alto.stop();
		
		alto.restart();
		
		alto.accelerate();
		
		alto.deacelerate();
		
		System.out.println("----------------------------------------------");

		Machine bmw = new Car();
		
		bmw.start();
		
		bmw.restart();
	}

}
