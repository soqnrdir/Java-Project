package examtest;

//VO(value object), DTO(data transfer object), model, bean, item 데이터를 저장하는 }객체
public class Car {
	private double speed;
	private String color;
	private final static double MAX_SPEED = 125.0;

	Car() {
	}

	public Car(String color) {
		this.color = color;
		speed = 0.0;
	}

	public double getSpeed() {
		return mileToKillo(speed);
	}

	public String getColor() {
		return color;
	}

	public static double getMaxSpeed() {
		return mileToKillo(MAX_SPEED);
	}

	public boolean speedup(double speed) {
		speed = killoToMile(speed);

		if (this.speed + speed < 0 || this.speed + speed > MAX_SPEED)
			return false;
		else {
			this.speed += speed;
			return true;
		}
	}

	private static double killoToMile(double distance) {
		return distance / 1.6;
	}

	private static double mileToKillo(double distance) {
		return distance * 1.6;
	}

}
