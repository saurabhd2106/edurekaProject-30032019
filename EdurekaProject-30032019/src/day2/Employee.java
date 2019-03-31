package day2;

public class Employee {

	int salary;
	int bonus;

	Employee() {
		System.out.println("I am constructor");
		salary = 70000;
		bonus  = 5000;
	}
	
	Employee(int salary, int bonus) {
		this.salary = salary;
		
		this.bonus = bonus;
	}
	
	
	void calculateSalary() {
		int totalSalary;

		totalSalary = salary + bonus;

		System.out.println("Total Salary : " + totalSalary);

	}

	int calculateSalary1() {

		int totalSalary;

		totalSalary = salary + bonus;

		return totalSalary;
				
	}
	
	int calculateSalary1(int sal, int bon) {

		int totalSalary;

		totalSalary = sal + bon;

		return totalSalary;
				
	}
	
	int calculateSalary2(int salary, int bonus) {

		int totalSalary;

		totalSalary = this.salary + this.bonus;

		return totalSalary;
				
	}

}
