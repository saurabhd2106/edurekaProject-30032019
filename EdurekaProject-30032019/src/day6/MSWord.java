package day6;

public class MSWord implements MSOffice {

	@Override
	public void start() {

		System.out.println("Start method from MS Word");

	}

	@Override
	public void newFile() {
		System.out.println("New File method from MS Word");

	}

	@Override
	public void save() {
		System.out.println("Save method from MS Word");

	}

	@Override
	public void saveAs() {
		System.out.println("Save as method from MS Word");

	}
	
	

}
