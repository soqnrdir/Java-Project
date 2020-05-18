package lecture04;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			System.out.println("점수를 입력하세요.");
		
			System.out.print("프로그래밍 기초: ");
			int program = scanner.nextInt();
			System.out.print("데이터베이스: ");
			int db = scanner.nextInt();
			System.out.print("화면 구현: ");
			int screen = scanner.nextInt();
			System.out.print("애플리케이션 구현: ");
			int app = scanner.nextInt();
			System.out.print("머신러닝: ");
			int machine = scanner.nextInt();
			
			int add = program + db + screen + app + machine;
			double aver = add/5.0;
				System.out.println("총점: " + add);
				System.out.println("평균: " + aver);
			
			if(aver>=90) {
				System.out.println("학점: A");
			} else if(aver>=80) {
				System.out.println("학점: B");
			} else if(aver>=70) {
				System.out.println("학점: C");
			} else if(aver>=60) {
				System.out.println("학점: D");
			} else {							//else가 없으면 다른값들이 아닐경우에 나올 값이 없으므로 에러가 발생할 수 있다.
				System.out.println("학점: F");
			}
			scanner.close();														
		}

}
