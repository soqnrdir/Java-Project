package examtest;

public class Quiz06 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i <= 100; i += 2) {
			sum += i;
		}
		System.out.println("1부터 100까지 짝수들의 총합은: " + sum);
	}

}
