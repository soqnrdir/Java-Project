package examtest;

public class Circle {
	private double radius;
	private double x;
	private double y;
	
	public Circle(double radius, double x, double y) {
		this.radius = radius;
		this.x = x;
		this.y = y;
	}
	
	public Circle() {
		
	}

	public double getArea() {
		return radius*radius*Math.PI;
	}
	
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		if(radius < 0) {
			this.radius = 0.0;
		} else {
			this.radius = radius;
		}
	
	}
	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
}

