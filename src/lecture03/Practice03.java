package lecture03;

import java.util.Scanner;

public class Practice03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 System.out.print("첫번째 수를 입력하세요:");
		 int x = scanner.nextInt();
		 System.out.print("두번째 수를 입력하세요:");
		 int y = scanner.nextInt();
		 // String result = (x > y)? "true" | "false";
		 
		 if (x > y) {
			 System.out.println("첫번째 수가 두번째 수보다 큰가? ture");
		 }
		 else   System.out.print("첫번째 수가 두번째 수보다 큰가? false"); 
		 
		 scanner.close();
		 
		 
		 
	}

}
