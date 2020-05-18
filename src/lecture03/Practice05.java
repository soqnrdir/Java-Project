package lecture03;

import java.util.Scanner;

public class Practice05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("500원 짜리 동전의 갯수:");
		int x = scanner.nextInt() *500 ;
		System.out.print("100원 짜리 동전의 갯수:");
		int y = scanner.nextInt() *100;
		System.out.print("50원 짜리 동전의 갯수:");
		int z = scanner.nextInt() *50;
		System.out.print("10원 짜리 동전의 갯수:");
		int v = scanner.nextInt() *10;
		int h = x + y + z + v;
		System.out.println("저금통 안의 동전의 총 액수:" + h);
		scanner.close();
	}

}
