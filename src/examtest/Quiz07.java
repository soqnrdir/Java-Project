package examtest;

public class Quiz07 {

	public static void main(String[] args) {
		int count = 0;
		System.out.println("100부터 10000 사이의 7의 배수는?");
		for (int i = 100; i <= 10000; i++) {
			if (i % 7 == 0)

				count++;
			System.out.println(i);

		}
		System.out.println("100부터 10000까지 7의 배수의 개수" + count);
	}

}
