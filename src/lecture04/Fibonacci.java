package lecture04;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		boolean start = true;
		while(start) {
		Scanner scanner = new Scanner(System.in);
	    System.out.print("몇 번째 항까지 출력하시겠습니까?(3 이상 입력): ");
	    int number = scanner.nextInt();
	    
	    	long num1,num2,sum;             //long 타입으로 바꿔줘야 큰 수가 나와도 최솟값으로 되돌아가지 않는다.
	    	num1=0;                
	    	num2=1; 			  	
	        sum =0;                
	    
		if(number >= 3) {
		 
	       for(int i=0; i<number; i++) {    // 입력한 항보다 작은 수가 나올때까지 증감 한다.
	    	   System.out.print(sum + " "); //공백을 주어 항을 나열한다. ex) 12번째 항까지면 공백이 11칸. 
	              
	       num1=num2;               //1    
	       num2=sum; 				//0
	       sum=num1+num2; 			//1
	       }         
	       start = false;
	         scanner.close(); 
			} else { System.out.println("3 이상의 수를 입력해주세요.");
		
			}    
		}	
		
	}	          
	
}	
	