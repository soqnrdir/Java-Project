package lecture03;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("원기둥 밑변의 반지름을 입력하시오.(단위: cm):");
		double x = scanner.nextDouble();
		System.out.println("원기둥의 높이를 입력하시오.(단위: cm):");
		double  y = scanner.nextDouble ();
		double z =Math.PI * x *x ;
		double v = z * y;
		System.out.println("원기둥 밑변의 넓이는" +z +"이고, 원기둥의 부피는" + v +"㎤다." );
		
		scanner.close();
		
		


	}

}
