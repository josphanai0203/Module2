package class_and_object;

public class Fan {
	final static int SLOW = 1;
	final static int MEDIUM = 2;
	final static int FAST = 3;
	private int speed;
	private boolean isOn;
	private double radius;
	private String color;

	public Fan() {
		this.speed = SLOW;
		this.isOn = false;
		this.radius = 5;
		this.color = "blue";
	}

	public Fan(int speed, boolean isOn, double radius, String color) {
		this.speed = speed;
		this.isOn = isOn;
		this.radius = radius;
		this.color = color;
	}

	@Override
	public String toString() {
		if (isOn) {

			return "Fan is on : speed=" + speed + ", radius=" + radius + ", color=" + color;

		} else {
			return "fan is off";
		}
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public boolean isOn() {
		return isOn;
	}

	public void setOn(boolean isOn) {
		this.isOn = isOn;
	}

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

	public void display() {
		System.out.println(this.toString());
	}

	public static void main(String[] args) {
		Fan f1 = new Fan(FAST, true, 10, "yellow");
		Fan f2 = new Fan(MEDIUM, false, 5, "blue");
		f1.display();
		f2.display();
		
	}

}
