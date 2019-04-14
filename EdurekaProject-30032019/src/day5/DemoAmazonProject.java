package day5;

public class DemoAmazonProject {

	public static void main(String[] args) {
		AmazonProject ap = new AmazonProject();
		
		ap.invokeBrowser();
		
		ap.searchProduct("apple watch", "Electronics");
		
		System.out.println(ap.getNthProduct(10));
		
		ap.getAllProductsViaScrollDownUsingJS();

	}

}
