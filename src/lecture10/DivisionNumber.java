package lecture10;

import java.util.Scanner;

public class DivisionNumber {
	public static void main(String[] args) {
		int division = 0;
		boolean start = true;
		while (start) {
			Scanner scanner = new Scanner(System.in);
			try {
				System.out.print("어떤 수로 나누시겠습니까???>> ");
				int number1 = scanner.nextInt();
				System.out.print("어떤 수를 나누시겠습니까???>> ");
				int number2 = scanner.nextInt();
				division = number1 / number2;
				System.out.println(number1 + "/" + number2 + " = " + division);
			} catch (ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
			} catch (Exception e) {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
				scanner.close();
				
			}
			continue;
		}
	
		
	}
}
