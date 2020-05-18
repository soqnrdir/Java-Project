package lecture04;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			System.out.print("윤년인지를 확인할 연도를 입력하세요:");
			int year = scanner.nextInt();
			if ((year % 4 == 0 && year % 100 !=0) || year % 400 == 0) { //윤년은 4의 배수라니 나머지가 0이되는 값을 찾는다. 
				// result = ""; -> 초기화
				System.out.println(year +"년은 윤년입니다.");      //도한 400배 또한 윤년이므로 똑같이 400을 나누어 나머지가 0이되면 true
			} else {
				System.out.println(year +"년은 윤년이 아닙니다."); //"년은"만 입력하고 그 뒤는 + result 로 해줘도 출력이 된다.
			}
             scanner.close();
	}

}
