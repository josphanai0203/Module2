package abstract_and_interface.bai_2;

public class Square extends Shape implements Colorable {
	private double edge;

	public Square() {
		super();
	}

	public Square(double edge) {
		super();
		this.edge = edge;
	}

	public double getEdge() {
		return edge;
	}

	public void setEdge(double edge) {
		this.edge = edge;
	}
	public double getArea() {
        return edge*edge;
    }

    public double getPerimeter() {
        return 4*edge;
    }

    @Override
    public String toString() {
        return "A Square with edge="
                + getEdge()
                + ", which is a subclass of "
                + super.toString();
    }

	@Override
	public void howToColor() {
		System.out.println(" Color all four sides.");
		
	}
}
