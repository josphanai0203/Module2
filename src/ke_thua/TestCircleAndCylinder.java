package ke_thua;

public class TestCircleAndCylinder {
	public static void main(String[] args) {
		Circle c = new Circle(5, "green");
		Cylinder cl = new Cylinder(10, "yellow", 5);
		System.out.println(c);
		System.out.println(cl);
		System.out.println(c.getArea());
		System.out.println(cl.getVolume());
	}
}
