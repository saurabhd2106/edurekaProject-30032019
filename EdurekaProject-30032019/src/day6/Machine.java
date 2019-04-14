package day6;

public class Machine {

	protected int engineSize;

	public Machine() {
		System.out.println("Constructor from parent class");
	}

	public void start() {
		System.out.println("Start Method from Machine class");
	}

	public void stop() {
		System.out.println("Stop Method from Machine class");
	}

	protected void restart() {
		System.out.println("Restart Method from Machine class");
	}
}
