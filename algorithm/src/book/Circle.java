package book;

public class Circle {
	private int radius;
	private Point center;
	
	public Circle(Point p,int r) {
		radius=r;
		center=p;
	}
	
	@Override
	public String toString() {
		return "Circle [radius="+radius+", center"+center+"]";
	}
}
