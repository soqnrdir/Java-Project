package practice;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null; //데이터의 종류는 int이며 몇개의 배열이 있는지는 모르는 상태.
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("-----------------------------------------------------------");
		    System.out.println("선택> ");
			
		    int selectNo = scanner.nextInt();
			
			if (selectNo == 1) {                           
				System.out.print("학생수> ");                   
				studentNum = scanner.nextInt();
				scores = new int[studentNum]; //길이가 studentNum인 int[] 배열을 생성한다.
			} else if (selectNo == 2) {
				for(int i =0;i<studentNum;i++) { //지정해준 학생수 만큼 증감된다.
					System.out.print("scores[" + i + "]> ");
					scores[i] = scanner.nextInt(); // 길이만큼의 배열을 지정해준다. 학생 각각의 점수를 지정.
				}
				
			} else if (selectNo == 3) {
				for(int i =0;i<studentNum;i++) {
					System.out.println("scores[" + i + "]: " +scores[i]); //지정한 학생들의 점수가 출력되도록 한다.
				}
					
			} else if (selectNo == 4) {
				int max = 0;
				int sum = 0;
				
				int[] score = { 85, 95, 93 };
				
				for(int i = 0;i<studentNum;i++) {
					sum += scores[i];
					
					if(max<score[i]) {
					max = scores[i];
					}
				}
				double avg = (double) sum/ studentNum;
				
				System.out.println("최고 점수: " + max);
				System.out.println("평균 점수: " + avg);
				
			} else if (selectNo == 5) {
				run = false;
			}
		}
		scanner.close();
		System.out.println("프로그램 종료");
	}
}
