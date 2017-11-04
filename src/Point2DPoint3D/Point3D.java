package Point2DPoint3D;

import java.util.Arrays;

public class Point3D extends Point2D {

	private float z;

	// private float xyz; 
	//don't need this

	public Point3D(float x, float y, float z) {
		super(x, y);
		setZ(z);
		// this.xyz = xyz;
	}

	public float getZ() {
		return z;
	}

	public void setZ(float z) {
		this.z = z;
	}

	public float[] getXYZ() {
		float xyz[] = new float[3];
		xyz[0] = getX();
		xyz[1] = getY();
		xyz[2] = getZ();
		return xyz;
	}

	// public void setXYz(float xyz) {
	// this.xyz = xyz;
	// } don't need this because we're taking the getX, getY, getZ

	@Override
	public void printPoint() {
		System.out.println("This is the x: " + getX());
		System.out.println("This is the y: " + getY());
		System.out.println("This is the z: " + getZ());
		System.out.println("This is the point: " + Arrays.toString(getXY()));
		System.out.println("This is the coordinate: "
				+ Arrays.toString(getXYZ()));
	}

}
