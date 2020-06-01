package exam7;

public class Rectangle extends Shape {
	private double width;
	private double height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height =height;
	}
	@Override
	public double area() {
		return 2*width + 2*height;
	}

	@Override
	public double perimeter() {
		return width * height;
	}
	@Override
	public String toString() {
		return "도형의 종류: 사각형, 둘레: " + String.format("%.2f", area()) + "cm, 넓이: "  + String.format("%.2f", perimeter()) + "㎤";

	}	
}
