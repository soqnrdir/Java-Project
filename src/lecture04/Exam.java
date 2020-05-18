package lecture04;

import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫 번째 숫자를 입력하세요:");
		int firNum = scanner.nextInt();
		System.out.print("두 번째 숫자를 입력하세요:");
		int secNum = scanner.nextInt();
		int bigNum = ((firNum + secNum) + Math.abs(firNum - secNum))/2;
		int smallNum = ((firNum + secNum) - Math.abs(firNum - secNum))/2;
		int nanugi = bigNum /  smallNum;
		int kobhagi = bigNum % smallNum;
		System.out.println("큰 수를 작은 수로 나눈 몫은" + nanugi + "이고, 나머지는" + kobhagi + "이다");
		scanner.close();
	}

}
