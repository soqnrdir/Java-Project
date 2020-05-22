package examtest;

import java.util.Scanner;

public class exam103 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean start = true;

		while (start) {

			System.out.print("년도를 입력하세요: ");
			int year = scanner.nextInt();
			System.out.println("월을 입력하세요: ");
			int month = scanner.nextInt();
			System.out.println("일을 입력하세요: ");
			int day = scanner.nextInt();
			if ((year <= 2100 && year >= 1900) && (month > 0 && month <= 12) && (day > 0 && day <= 31)) {
				start = true;
			} else {
				System.out.println("입력이 잘못되었습니다.");
				continue;
			}

			int totalDays = 0;

			totalDays += (year - 1900) * 365;
			totalDays += (year - 1900) / 4;
			
			if ((((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) && (month == 1 || month == 2)) == true) {
				totalDays = totalDays + 1;
			
			}
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
			
			String sevenDays = "";
			switch (totalDays % 7) {
			case 0:
				sevenDays = "일요일";
				break;
			case 1:
				sevenDays = "월요일";
				break;
			case 2:
				sevenDays = "화요일";
				break;
			case 3:
				sevenDays = "수요일";
				break;
			case 4:
				sevenDays = "목요일";
				break;
			case 5:
				sevenDays = "금요일";
				break;
			case 6:
				sevenDays = "토요일";
				break;

			}

			System.out.println(year + "년 " + month + "월 " + day + "일은 " + sevenDays + "입니다.");

			boolean recontinue = true;
			while (recontinue) {

				System.out.print("계속하시겠습니까?(y/n)");
				String yesORno = scanner.next();

				if (yesORno.equals("y")) {
					recontinue = false;
					start = true;
				} else if (yesORno.equals("n")) {
					recontinue = false;
					start = false;
					System.out.println("프로그램을 종료합니다.");
				} else {
					System.out.println("다시 입력해 주세요.");
					continue;
				}
			}
		}
		scanner.close();
	}
}
