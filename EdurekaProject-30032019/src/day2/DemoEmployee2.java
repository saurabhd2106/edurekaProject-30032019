package day2;

public class DemoEmployee2 {

	public static void main(String[] args) {
		Employee saurabh = new Employee(40000, 5000);
		
		saurabh.salary = -954965;
		
		Employee kanika = new Employee(80000, 7000);
		
		saurabh.calculateSalary();
		
		kanika.calculateSalary();
		


	}

}
