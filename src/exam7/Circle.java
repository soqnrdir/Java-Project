package exam7;

public class Circle extends Shape {
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
		
	}

	@Override
	public double area() {
		return 2 * Math.PI *radius;
	}

	@Override
	public double perimeter() {
		return Math.PI * radius * radius;
	}

	@Override
	public String toString() {
		return  "도형의 종류: 원, 둘레: " + area() + "cm, 넓이: " + perimeter() + "㎤";

	}

}

