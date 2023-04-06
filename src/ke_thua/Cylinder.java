package ke_thua;

public class Cylinder extends Circle{
	private int height;
	public Cylinder(int radius, String color,int height) {
		super(radius, color);
		this.height = height;
		// TODO Auto-generated constructor stub
	}
	public double getVolume(){
        return super.getRadius()*2*Math.PI*getHeight();
    }
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return "Cylinder [height=" + height + " ,radius=" + super.getRadius() + ", color=" + super.getColor() + "]";
	}
	

}
