package ke_thua;

public class Circle {
	private int radius;
	private String color;
	public Circle(int radius, String color) {
		this.radius = radius;
		this.color = color;
	}
	 public double getArea(){
	        return getRadius()*getRadius()*Math.PI;
	    }

	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + "]";
	}
	
}
