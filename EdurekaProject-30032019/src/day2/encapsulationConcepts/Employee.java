package day2.encapsulationConcepts;

public class Employee {

	private int salary;
	private int bonus;

	void calculateSalary() {
		int totalSalary;

		totalSalary = salary + bonus;

		System.out.println("Total Salary : " + totalSalary);

	}

	public void setSalary(int salary) {
		if (salary > 0) {
			this.salary = salary;
		} else {
			System.err.println("Invalid salary");
		}
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	public int getSalary(){
		return salary;
	}

	public int getBonus() {
		return bonus;
	}

}
