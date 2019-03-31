package day2;

public class DemoEmployee {

	public static void main(String[] args) {
		
		//Declaring a variable
		Employee saurabh;

		//Instantiation and Initialization
		saurabh = new Employee();
		
		saurabh.salary = 859345;
		
		saurabh.bonus = 8989;
		
		saurabh.calculateSalary();
		
		//--------------------------------------------
		
		Employee gaurav = new Employee();
		
		gaurav.salary = 70000;
		gaurav.bonus = 5000;
		
		gaurav.calculateSalary();
		
		//--------------------------------------------
		
		Employee akshay = new Employee();
		
		akshay.salary = 7982374;
		akshay.bonus = 783432;
		
		int akshaySalary = 	akshay.calculateSalary1();
		
		System.out.println("Akshay's Salary : "+ akshaySalary );
		
		//-----------------------------------------------
		
		Employee mohan = new Employee();
		
		
		int mohanSalary = mohan.calculateSalary1(80000, 70000);
		
		System.out.println("Mohan's Salary : "+ mohanSalary);
		
		//--------------------------------------
		
		Employee kanika = new Employee();
		
		kanika.salary = 900000;
		
		kanika.bonus = 60000;
		
		int kanikaSalary = kanika.calculateSalary2(4654645, 435345);
		
		System.out.println("Kanika's Salary : "+ kanikaSalary);
	}

}
