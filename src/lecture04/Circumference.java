package lecture04;

import java.util.Scanner;

public class Circumference {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean start = true;
		while (start) {                                          //while문 대신 for문으로 for (int i = 2; true; i+=2) 이라는 조건식을 세울 수 있다.
		System.out.print("허용 오차: ");
		double Tolerance = scanner.nextDouble();
        double Tolerance2;
		double pi = 3.0;
	    double n = 2.0;
	    double four = 4.0;
	    while(start) {
	     pi = pi+ four/(n*(n+1)*(n+2));
	    four = -four;
	   n+=2.0;
	   Tolerance2 = Math.abs(Math.PI-pi);
	    if (Tolerance<=Tolerance2) {
	    	continue;
	    } else {
	    	break;
	    	
	    }
	  }
	   double count = (n/2.0-1.0);                   //n을 2씩 증가시켰으니 2로 나누고 1을 빼주면 반복횟수가 나온다.
	   System.out.println("Math.PI = " + Math.PI);
	   System.out.println("계산된 파이값 = " + pi );
	   System.out.println("반복횟수: " + (int)count);
	   System.out.println(" ");	
	   
		}	
		scanner.close();
		
	}
	
	
}
