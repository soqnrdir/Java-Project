package lecture04;

import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			System.out.println("가위 바위 보를 입력하세요.");
			System.out.print("철수: ");
			String cheolsu = scanner.next();
			System.out.print("영희: ");
			String younghee = scanner.next();
		
	    if(cheolsu.equals(younghee)) {
		    System.out.println("결과 : 무승부입니다!");
	    
	    } else if(
	    		  (cheolsu.equals("바위")&&younghee.equals("보"))   || 
	    		  (cheolsu.equals("가위")&&younghee.equals("바위")) || 
			      (cheolsu.equals("보")&&younghee.equals("가위"))		
			   ) {
			        System.out.println("결과 : 영희 승리!");
	    
	    } else {
			        System.out.println("결과 : 철수 승리!");
		}
		scanner.close();
			
	}
		   
}

//**** 문제 출제 ****