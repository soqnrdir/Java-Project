package lecture10;

import java.util.Scanner;

public class TryCatchFinallyRuntimeExceptionExample {

	public static void main(String[] args) /*throws Exception 한번에 처리 가능 */{
		try (Scanner scanner = new Scanner(System.in)) {
			String data1 = scanner.next();
		    String data2 = scanner.next();

			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + " + " + data2 + " = " + result);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
			System.out.println("[실행 방법]");
			System.out.println("java TryCatchFinallyRuntimeExceptionExample num1 num2");
			return;
		} catch (NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		} finally {
			System.out.println("다시 실행하세요.");
		}

	}

}
