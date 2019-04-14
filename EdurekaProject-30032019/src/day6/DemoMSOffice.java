package day6;

public class DemoMSOffice {

	public static void main(String[] args) {
		
		MSOffice msExcel = new MSExcel();
		
		MSExcel excel = new MSExcel();

		excel.start();

		excel.save();
		
		
		excel.excelDownload();

	}

}
