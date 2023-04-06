package ke_thua;

public class MovablePoint extends Point {
	private float xSpeed;
	private float ySpeed;
	public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
		super(x, y);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	public MovablePoint(float xSpeed, float ySpeed) {
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	public MovablePoint() {
	}
	public float getxSpeed() {
		return xSpeed;
	}
	public void setxSpeed(float xSpeed) {
		this.xSpeed = xSpeed;
	}
	public float getySpeed() {
		return ySpeed;
	}
	public void setySpeed(float ySpeed) {
		this.ySpeed = ySpeed;
	}
	public void Speed(float xSpeed,float ySpeed) {
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	public float[] getXY() {
		float[] arr = new float[2];
		arr[0] = getxSpeed();
		arr[1] = getySpeed();
		return arr;
	}
	@Override
	public String toString() {
		return super.toString() + " ,speed = ("+ getxSpeed()+","+getySpeed()+")";
	}
	
}
