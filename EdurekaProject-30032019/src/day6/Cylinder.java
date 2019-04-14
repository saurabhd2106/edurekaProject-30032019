package day6;

public class Cylinder extends Shape {

	@Override
	public double areaOfBase(int side) {

		return Math.PI * side * side;
	}

}
