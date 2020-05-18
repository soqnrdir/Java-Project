package lecture04;

import java.util.Random;
import java.util.Scanner;

public class IfDiceExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		   System.out.print("시작합니다 아무거나 쳐보세요.");
	
	  
	   for(;;) {
		   String word =scanner.next();
		   Random random = new Random();  //변수에 있는 것을 가져온다.
		   int num = random.nextInt(6) + 1; // 1부터 ~ 6까지 리턴


		   System.out.println(num + "번이 나왔습니다.");
		   
		   
		   
		   if(word.equals("종료"))  {
			   break;   
			
		   }
		
	   }
	   scanner.close();
	       
	
	}

}

