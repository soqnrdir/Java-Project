package exam7;

public class Triangle extends Shape {
	private double side;
	
	public Triangle(double side) {
		this.side = side;
	}

	@Override
	public double area() {
		return side * 3; 
	}

	@Override
	public double perimeter() {
		return Math.sqrt(3) * side * side * 1/4;
	}

	@Override
	public String toString() {
		return "도형의 종류: 삼각형, 둘레: " + area() + "cm, 넓이: " + perimeter() + "㎤";
	}
}