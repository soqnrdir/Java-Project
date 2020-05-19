package examtest;

import java.util.Scanner;

public class Quiz16 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int[] arrayNumber = new int[5];

		for (int i = 0; i < 5; i++) {
			System.out.print((i + 1) + "번째 정수를 입력하세요: ");
			arrayNumber[i] = scanner.nextInt();
			for (int j = 0; j < i; j++) {
				if (arrayNumber[i] == arrayNumber[j]) {
					System.out.println("***중복입니다! 숫자를 다시 입력해주세요***");
					i--;
				}

			}
		}
		scanner.close();
		System.out.println("입력한 정수입니다.");
		for (int i = 0; i < 5; i++) {

			System.out.print(arrayNumber[i] + " ");
		}

	}
}