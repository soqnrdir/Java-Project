package exam7;

public abstract class Shape implements Comparable<Shape> {


	public abstract double area();
	
	public abstract double perimeter();

	@Override
	public int compareTo(Shape o) {
		if (perimeter() > o.perimeter()) {
			return 1;
		} else if (perimeter() == o.perimeter()) {
			return 0;
		} else {
			return -1;
		}
	
	}

		
	
		
	}


