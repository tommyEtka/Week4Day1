package CircleCylinder;

public class CircleCylinderApp {


	public static void main(String[] args) {
		
		Circle c1 = new Circle(3, "blue");
		
		c1.printCircle();
		
		System.out.println();
		
		Cylinder cd = new Cylinder(5, "blue", 3);
		
		cd.printCylinder();
		

	}

}
