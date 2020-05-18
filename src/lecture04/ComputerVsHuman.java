package lecture04;

import java.util.Scanner;

public class ComputerVsHuman {

	public static void main(String[] args) {
		int randomNum = (int)(Math.random() * 3 + 1);
		Scanner scanner = new Scanner(System.in);
		System.out.println("가위 바위 보 게임을 시작합니다.");
		System.out.println("가위 바위 보 중 하나를 내세요.");
		System.out.print("유저 : ");
		String user = scanner.next();
		
		String computer = " ";    //문자열 초기값을 선언해준다.
		if (randomNum == 0) {     // 숫자 0 ,1 ,2 까지 랜덤으로 나오므로 이를 문자열로 바꿔준다.
			computer = "가위";
		} else if (randomNum == 1) {
			computer = "바위" ;
		} else {
			computer = "보";
		}
		System.out.println("컴퓨터 : " + computer);  //유저가 가위, 바위, 보 중에 하나를 내면 컴퓨터가 랜덤으로 가위, 바위, 보 중 하나를 낸다.
		if(user.equals(computer)) {
		    System.out.println("결과 : 무승부입니다!");
	    
	    } else if(
	    		  (user.equals("바위")&&computer.equals("보"))   || 
	    		  (user.equals("가위")&&computer.equals("바위")) || 
			      (user.equals("보")&&computer.equals("가위"))		
			   ) {
			        System.out.println("결과 : 유저 승리!");
	    
	    } else {
			        System.out.println("결과 : 컴퓨터 승리!");
		}
		scanner.close();
	
	//수정 
			
	}

}
