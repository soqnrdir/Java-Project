package lecture04;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("수도입니까?(수도: 1, 수도아님: 0)");
		int capital = scanner.nextInt();

		System.out.print("총 인구는?(단위: 만)");
		int popualation = scanner.nextInt();
	
		System.out.print("연소득이 1억 이상인 인구는?(단위: 만)");
		int salary = scanner.nextInt();
        
		if ((capital==1 & popualation>=100)||(salary>=50)) {
			System.out.println("메트로폴리스입니다.");
	
			} else {
				System.out.println("메트로 폴리스가 아닙니다.");
		}
		scanner.close();
		
	}

}

