package nolan.s.shapes;

public class trapezoid extends shape implements Printable {

// one of the bases of the trapezoid
	private int baseA;
// the other base of the trapezoid
	private int baseB;
// the height of the trapezoid
	private int height;

	public trapezoid(int baseA, int baseB, int height) {
		this.baseA = baseA;
		this.baseB = baseB;
		this.height = height;
// invoke the methods in the superclass to set the type and name of this trapezoid
		setshapeType("Quadrilateral");
		setshapeName("Trapezoid");
	}

// override the method inherited from Shape (which is implemented from the Printable interface)
// to handle custom description printing
	@Override
	public void printDescription() {
  // invoke the super method because it contains the part that prints out the type, just for DRY purposes
		super.printDescription();
		System.out.println("Base A is " + baseA + " units");
		System.out.println("Base B is " + baseB + " units");
		System.out.println("Height is " + height + " units");

	}

// override the method inherited from Shape to calculate the area of a trapezoid
	@Override
	public double getArea() {
// area of a trapezoid is the average of the bases times the height
		return 0.5d * (baseA + baseB) * height;
	}
}
