package examtest;

public class Time {
	private int hour;
	private int minute;
	private int second;

	public Time() {

	}

	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		if (hour < 0 || hour > 23) {
			hour = 0;
		}
		if (minute < 0 || minute > 59) {
			this.minute = 0;
		}
		if (second < 0 || second > 59) {
			this.second = 0;
		}

	}

	public String toString() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}

}
