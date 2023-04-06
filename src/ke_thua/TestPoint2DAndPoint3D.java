package ke_thua;

public class TestPoint2DAndPoint3D {
	public static void main(String[] args) {
		Point2D p2 = new Point2D(2f, 3f);
		Point3D p3 = new Point3D(2f, 3f, 4.5f);
		System.out.println(p2.getXY()[1]);
		System.out.println(p2);
		System.out.println(p3.getXYZ()[2]);
		System.out.println(p3);
	}
}
