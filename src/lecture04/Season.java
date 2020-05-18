package lecture04;

import java.util.Scanner;

public class Season {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean month = true;
		
	    while (month) {
		System.out.print("월을 입력하세요(1~12): ");
			int season = scanner.nextInt();
			//String ssfw = "";
		
		switch(season) {
		case 12 : System.out.println(season +"월은 겨울입니다.");
     		break;
		case 1 : System.out.println(season +"월은 겨울입니다.");    
			break;
		case 2 : System.out.println(season +"월은 겨울입니다.");    // case 끼리 묶어서 한번에 나올 수도 있다. ex) case 12: case 1: case 2:
			break;													// ssfw = "겨울";
		case 3 : System.out.println(season +"월은 봄입니다.");
			break;
	    case 4 : System.out.println(season +"월은 봄입니다.");
			break;
	    case 5 : System.out.println(season +"월은 봄입니다.");
	    	break;
        case 6 : System.out.println(season +"월은 여름입니다.");
     		break;
        case 7 : System.out.println(season +"월은 여름입니다.");
        	break;
        case 8 : System.out.println(season +"월은 여름입니다.");
        	break;
        case 9 : System.out.println(season +"월은 가을입니다.");
        	break;
        case 10 : System.out.println(season +"월은 가을입니다.");
        	break;
        case 11 : System.out.println(season +"월은 가을입니다.");
        	break;
        default : System.out.println(season +"월은 잘못된 입력입니다.");
        	
			
			}	
			
	    }
	    //System.out.println(season + "월은" + ssfw + "입니다"); 이처럼 봄, 여름, 가을, 겨울만 입력해서 출력 할 수 있다.
		scanner.close();
	}

}
