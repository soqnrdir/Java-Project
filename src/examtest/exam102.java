package examtest;

import java.util.Scanner;

public class exam102 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int dice = 6;
		int random[] = new int[dice];

		for (int i = 0; i < 10000; i++)

			++random[(int) (Math.random() * dice)]; // 랜덤을 증감시켜준다. 10000까

		System.out.println("------------");
		System.out.println("면      빈도");
		System.out.println("------------");

		for (int i = 0; i < dice; i++) // 0~5까지 증가

			System.out.println((i + 1) + "       " + random[i]);
		scanner.close();
	}
}
