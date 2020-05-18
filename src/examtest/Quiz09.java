package examtest;

import java.util.Scanner;

public class Quiz09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean start = true;
		while (start) {
			System.out.println("");
			System.out.print("원하는 단을 입력하세요: ");
			int gugudan = scanner.nextInt();
			System.out.println("**********" + gugudan + "단**********");

			for (int i = 1; i < 10; i++) {
				System.out.println(gugudan + "x" + i + "=" + (gugudan * i));
			}
			continue;

		}
		scanner.close();
//수정 
	}

}
