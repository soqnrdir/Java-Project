package examtest;

import java.util.Scanner;

public class Quiz17 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int totalDays = 0;
		System.out.print("년도를 입력하세요: ");
		int year = scanner.nextInt();
		System.out.println("월을 입력하세요: ");
		int month = scanner.nextInt();
		System.out.println("일을 입력하세요: ");
		int day = scanner.nextInt();
		
		
		
		switch (month) {
		case 1:
			totalDays += day;
			break;
		case 2:
			totalDays = totalDays += 31 + day;
			break;
		case 3:
			totalDays = totalDays += 31 + 28 + day;
			break;
		case 4:
			totalDays = totalDays += 31 + 28 + 31 + day;
			break;
		case 5:
			totalDays = totalDays += 31 + 28 + 31 + 30 + day;
			break;
		case 6:
			totalDays = totalDays += 31 + 28 + 31 + 30 + 31 + day;
			break;
		case 7:
			totalDays = totalDays += 31 + 28 + 31 + 30 + 31 + 30 + day;
			break;
		case 8:
			totalDays = totalDays += 31 + 28 + 31 + 30 + 31 + 30 + 31 + day;
			break;
		case 9:
			totalDays = totalDays += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + day;
			break;
		case 10:
			totalDays = totalDays += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + day;
			break;
		case 11:
			totalDays = totalDays += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + day;
			break;
		case 12:
			totalDays = totalDays += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + day;
			break;
		
		}
		if ((((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) && (month == 1 || month == 2))) {
		totalDays = totalDays -1;
		}
		
		System.out.println(totalDays);
				
	}

}