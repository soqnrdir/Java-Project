package lecture04;

import java.util.Scanner;

public class GradeExample {

	public static void main(String[] args) {
		// 사용자로부터 점수를 입력받아
		// 90점 ~ 100점이면 A
		// 80점 ~ 89점이면 B
		// 70점 ~ 79점이면 C
		// 60점 ~ 69점이면 D
		// 60점 미만 F
		// 를 출력하는 프로그램을 작성하시오.
		// switch 문을 사용
		Scanner scanner = new Scanner(System.in);
		System.out.print("당신의 점수는?:");
			int score = scanner.nextInt();
		
			switch(score) {                                         
		    
			case 100:
			case 99:
			case 98:
			case 97:
			case 96:
			case 95:
			case 94:
			case 93:
			case 92:
			case 91:
			case 90:
				System.out.println("A");
				break;
	        case 89:
			case 88:
			case 87:
			case 86:
			case 85:
			case 84:
			case 83:
			case 82:
			case 81:
			case 80:
				System.out.println("B");
				break;
			case 79:
			case 78:
			case 77:
			case 76:
			case 75:
			case 74:
			case 73:
			case 72:
			case 71:
			case 70:	
				System.out.println("C");
				break;
			case 69:
			case 68:
			case 67:
			case 66:
			case 65:
			case 64:
			case 63:
			case 62:
			case 61:
			case 60:	
				System.out.println("D");
				break;
			default:
				System.out.println("F");
				break;
				
			
			}
	}
}
/*          switch(score - score % 10) or switch(score/10) {
 *          case10:
 *          case9:
 *          ...A
 *          case8:
 *          ...B
 *          case7:
 *          ...C
 *          case6:
 *          ...D
 *          Default:
 *          ....
 *         
 */
	
			
	
