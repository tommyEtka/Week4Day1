package Point2DPoint3D;

import java.util.Arrays;

public class Point2D {

	private float x;
	private float y;

	// private float xy [] = new float [2]; WRONG
	// private float xy; don't need this because there is no setXY()

	public Point2D(float x, float y) {
		setX(x);
		setY(y);
		// this.xy = xy;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public float[] getXY() {
		float xy[] = new float[2];
		xy[0] = getX();
		xy[1] = getY();
		return xy;
	}

	// public void setXY(float xy) {
	// this.xy = xy;
	// } don't need this because we're using the getX, getY

	public void printPoint() {
		System.out.println("This is the x: " + getX());
		System.out.println("This is the y: " + getY());
		System.out.println("This is the point: " + Arrays.toString(getXY()));
	}

}
