package CircleCylinder;

public class Circle {

 private double radius;
 private String color;
 private double area;
 
 
public double getRadius() {
	return radius;
}
public void setRadius(double radius) {
	this.radius = radius;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public double getArea() {
	area = Math.PI*2*radius;
	//System.out.println(area);
	return area;
}
public Circle() {
	super();
}

public Circle(double radius, String color) {
	super();
	this.radius = radius;
	this.color = color;
}

//is this overloading? all the circle methods are the same but have different signatures
public Circle(double radius, String color, double area) {
	super();
	setRadius(radius);
	setColor(color);
	this.area = area;
}

public void printCircle(){
	System.out.println("this is the circle's radius: " + radius);
	System.out.println("this is the circle's color: " + color);
	System.out.println("this is the circle's area: " + getArea());
	
}

}
