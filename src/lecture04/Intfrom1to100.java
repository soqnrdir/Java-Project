package lecture04;

import java.util.Scanner;

public class Intfrom1to100 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			int number = (int)(Math.random() * 100 + 1); //1~100 사이 랜덤으로 정수 하나를 정한다.
			System.out.println("숫자맞추기 게임을 시작합니다!");
			
		while (true) {
			System.out.println("1부터 100 사이의 정수 중 하나를 선택하세요: ");
				int answer = scanner.nextInt();
			
			if(answer < number) {
				System.out.println("정답은 더 큰 수입니다.");
			} else if (answer > number) {
				System.out.println("정답은 더 작은 수입니다.");
			} else {
				System.out.println("정답입니다.");
				System.out.println("게임을 종료합니다.");
				break;     
			}
			
		}
		scanner.close();
	}

}