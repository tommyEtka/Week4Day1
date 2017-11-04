package CircleCylinder;

public class Cylinder extends Circle {

	public Cylinder(double radius, String color, double height) {
		super(radius, color);
		setHeight(height);
	}

	public Cylinder(double radius, String color) {
		super(radius, color);
		setHeight(height);
	}

	public Cylinder() {
		super();
		setHeight(height);
		// TODO Auto-generated constructor stub
	}

	private double height;

	// private double area;
	// private double volume;

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getVolume() {
		return Math.PI * getRadius() * getRadius() * height;
		// double volume = Math.PI*getRadius()*getRadius()*height;
		// return volume;
	}

	@Override
	public double getArea() {
		// double area = (2*Math.PI* getRadius()*height) + (2*Math.PI *
		// getRadius()*getRadius());
		// return area;
		return (2 * Math.PI * getRadius() * height)
				+ (2 * Math.PI * getRadius() * getRadius());

	}

	public void printCylinder() {
		System.out.println("this is the cylinder's radius: " + getRadius());
		System.out.println("this is the cylinder's color: " + getColor());
		System.out.println("this is the cylinder's area: " + getArea());
		System.out.println("this is the cylinder's volume: " + getVolume());

	}

}
