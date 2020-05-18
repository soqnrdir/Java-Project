package examtest;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean start = true;
		while(start) {
		System.out.print("첫 번째 숫자를 입력하세요: ");
		int firstNumber = scanner.nextInt();
		System.out.print("두 번째 숫자를 입력하세요: ");
		int secondNumber = scanner.nextInt();
		
		if (firstNumber > secondNumber) {
			System.out.println("큰수 : " + firstNumber + ", " + "작은 수 : " +secondNumber);
		} else if (firstNumber < secondNumber) {
			System.out.println("큰수 : " + secondNumber + ", " + "작은 수 : " +firstNumber);
		} else {
			System.out.println("두 수가 같습니다.");
		}
		continue;
		}
		
		scanner.close();
	
	}

}
