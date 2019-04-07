package day4.javaConcepts;

public class Shape {

	// area for circle
	public double calculateArea(double radius) {

		double area;

		area = Math.PI * radius * radius;

		return area;
	}

	public int calculateArea(int len, int wid) {

		int area;

		area =  len * wid;

		return area;
	}
	
	public double calculateArea(int side) {

		double area;

		area =  side * side;

		return area;
	}

}
