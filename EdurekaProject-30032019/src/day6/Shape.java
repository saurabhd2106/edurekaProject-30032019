package day6;

public abstract class Shape {

	public double calculateVolume(int side, int height) {

		double volume;

		volume = areaOfBase(side) * height;
		
		return volume;
	}

	public abstract double areaOfBase(int side);
}
