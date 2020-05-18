package examtest;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		int inputNum;

		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하시오.");
		inputNum = scanner.nextInt();
		System.out.println("입력한 숫자 : " + inputNum);
		scanner.close();
	}

}
