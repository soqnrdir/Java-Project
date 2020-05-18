package examtest;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
	Scanner	scanner = new Scanner(System.in);
	boolean start = true;
	
	while(start) {
		System.out.print(" 나이를 입력해 주세요.: ");
		int age = scanner.nextInt();
		
		if (age>=20 && age<30) {
			System.out.println("20대입니다.");
		} else {
			System.out.println("20대가 아닙니다.");
		}
		
		
		switch(age) {
		case 20 :
		case 21 :
		case 22 :
			System.out.println("20대 초반입니다.");
			break;
		case 23 :
		case 24 :
		case 25 :
		case 26 :
			System.out.println("20대 중반입니다.");
			break;
		case 27 :
		case 28 :
		case 29 :
			System.out.println("20대 후반입니다.");
			break;
		}
		continue;
	}
		scanner.close();
	}

}
