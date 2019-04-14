package day6;

public class DemoShape {

	public static void main(String[] args) {
		Cylinder cyl = new Cylinder();
		
		System.out.println(cyl.calculateVolume(10, 10));
		
		Cube cube = new Cube();
		
		System.out.println(cube.calculateVolume(10, 10));

	}

}
