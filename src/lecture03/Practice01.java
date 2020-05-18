package lecture03;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.print("가로의 길이는?(단위 : m):");
		 double x = scanner.nextDouble();
		 System.out.print("세로의 길이는?(단위 : m):");
		 double y = scanner.nextDouble();
		
	     double z = x * y;
		 System.out.print("직사각형의 넓이:" + z);
		 double v = 2*x + 2*y;
		 System.out.print("직사각형의 넓이:" + v);
		 
		 scanner.close();

	}

}
