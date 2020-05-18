package practice;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
			boolean run = true;
			int balance = 0;
	while(run) {	
		System.out.println("------------------------------------");
		System.out.println("1.예금 | 2. 출금 | 3.잔고 | 4.종료");
		System.out.println("------------------------------------");
		System.out.print("선택> ");
		int number = scanner.nextInt();
		int money = 0;
		
		switch(number) {
		case 1:
			System.out.println("예금액> ");
			money = scanner.nextInt();
			balance += money;
	        break;
		case 2:
			System.out.println("출금액> ");
			money = scanner.nextInt();
			balance -= money;
			break;
		case 3:
			System.out.println("잔고> " + balance);
	        break;
		case 4:
			run =false;
			break;
		}
		
	}
	        System.out.println("프로그램을 종료합니다.");
	        scanner.close();
	}

}
