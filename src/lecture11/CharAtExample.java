package lecture11;

import java.util.Scanner;

public class CharAtExample {
	public static void main(String[] args) {
		String a = new String("신민철");
		String b = "신민철";
		String c = "신민철";
		byte[] bytes = c.getBytes(); 
		
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.next();
		if (inputString.length() > 7) {
			System.out.println(inputString);
			System.out.println("7번째 글자: " + inputString.charAt(6));
			char charAt = inputString.charAt(6);
		} else {
			System.err.println("7글자 이상 입력하세요.");
		}
		scanner.close();

	}

}
