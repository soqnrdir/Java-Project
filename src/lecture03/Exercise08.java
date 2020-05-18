package lecture03;

import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);   //결과를 담아주는 역할 Scanner 라는 타입. -> 사용자가 입력해놓은 것을 받음.          	
       System.out.print("x를 입력하세요:"); 
	   double x = scanner.nextDouble();
	   System.out.print("y를 입력하세요:");
       double y = scanner.nextDouble();
       double z = x % y;
       
       if(Double.isNaN(z)) {                       
    	   System.out.println("0.0으로 나눌 수 없습니다.");   
       } else {
    	   double result = z + 10;
    	   System.out.println("결과: " + result);
       }
       scanner.close(); //스캐너를 사용 후에 다시 돌려줘야 한다.
	}

}

