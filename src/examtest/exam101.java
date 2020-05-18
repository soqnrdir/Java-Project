package examtest;

import java.util.Scanner;

public class exam101 {

	public static void main(String[] args) {
		int studentNum = 0;
		int[] scores = null;
		int sum = 0;
		double avg = 0.0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("몇 명의 성적을 입력하시겠습니까? ");
		studentNum = scanner.nextInt();
		scores = new int[studentNum];

		for (int i = 0; i < studentNum; i++) {
			System.out.print("성적을 입력하시오: ");
			scores[i] = scanner.nextInt();
			sum += scores[i];
			avg = (double) sum / studentNum;

		}
		System.out.println("총점은" + sum + "점이고, 평균 성적은" + avg + "점입니다.");
		scanner.close();
	}

}
