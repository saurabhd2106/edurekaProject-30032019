package day6;

public class MSExcel implements MSOffice {

	@Override
	public void start() {

		System.out.println("Start method from MS Excel");

	}

	@Override
	public void newFile() {
		System.out.println("New File method from MS Excel");

	}

	@Override
	public void save() {
		System.out.println("Save method from MS Excel");

	}

	@Override
	public void saveAs() {
		System.out.println("Save as method from MS Excel");

	}
	
	public void excelDownload(){
		System.out.println("Download excel");
	}

}
