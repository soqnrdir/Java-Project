package examtest;

public class Quiz08 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;

		for (i = 0 ;true; i++) {
			sum += i;

			if (sum > 100) {
				break;
			}
		}
		System.out.println("합이 100을 넘을 때의 숫자: " + i);

	}
}
