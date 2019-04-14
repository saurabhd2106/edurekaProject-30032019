package day6;

public class DemoMachine {
	
	public static void main(String[] args) {
		
		
		Machine mac = new Machine();
		
		mac.start();
		
		mac.engineSize = 1000;
		
		System.out.println("--------------------------------------------");
		
		Car alto = new Car();
		
		alto.start();
		alto.accelerate();
		
		System.out.println("---------------------------------------------");
		
		Machine bmw = new Car();
		
		bmw.start();
		
		
	}

}
