package lecture04;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			System.out.print("삼각형의 첫번째 변의 길이를 입력하세요: ");
			int oneLength = scanner.nextInt();
			System.out.print("삼각형의 두번째 변의 길이를 입력하세요: ");
			int twoLength = scanner.nextInt();
			System.out.print("삼각형의 세번째 변의 길이를 입력하세요: ");
			int thrLength = scanner.nextInt();
		
			if (oneLength < twoLength + thrLength) {
				System.out.println("삼각형을 만들 수 있습니다.");
			} else if (twoLength < oneLength + thrLength) {
				System.out.println("삼각형을 만들 수 있습니다.");
			} else if (thrLength < oneLength + twoLength) {
				System.out.println("삼각형을 만들 수 있습니다.");
			} else {
				System.out.println("삼각형을 만들 수 없습니다.");
			}
				
			scanner.close();
	
	
	
	}
}


/* if (
	  (oneLength < twoLength + thrLength) &&
	  (twoLength < oneLength + thrLength) &&
	  (thrLength < oneLength + twoLength)
	  )  이처럼 논리연산자를 이용해 한번에 묶어 표시 할 수도있다. */