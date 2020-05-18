package lecture04;

import java.util.Scanner;

public class circle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean start = true;
		while(start) {
		System.out.print("허용 오차: ");
		//허용오차
		double tolerance = scanner.nextDouble();
		double pi = 3;
		double sign = 1;
		int count = 1 ;
		for (int i = 2;true;i+=2) {
			pi += 4.0/(i*(i+1)*(i+2)) *sign;
			sign *= -1;
			if (Math.abs(Math.PI - pi) < tolerance) {
				break;
			}
			count++;
		}
		System.out.println("Math.PI = " + Math.PI);
		System.out.println("계산된 파이값 = " + pi);
		System.out.println("반복횟수: " + count);
		System.out.println(" ");
		}
		start = false;
		scanner.close();
	}

}
