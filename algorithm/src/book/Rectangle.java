package book;

public class Rectangle extends Shape{
	private int width;
	private int height;
	
	//접근자와 설정자
	public int getWidth() {		return width;	}
	public void setWidth(int width) {	this.width=width;	}
	public int getHeight() {		return height;	}
	public void setHeight(int height) {	this.height=height;	}
	
	double area() {
		return (double)width*height;
	}
	void draw() {
		System.out.println("("+this.getX()+","+this.getY()+") 위치에 "+"가로: "+width+" 세로: "+height);
	}

}
