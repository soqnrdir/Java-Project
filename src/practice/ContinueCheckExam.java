                                           package practice;

public class ContinueCheckExam {

	public static void main(String[] args) {
		int sum = 0;
			for(int i = 1; i<=100; i++) {
				if(i%3 !=0) {					//3의 배수가 아니면.
				continue;                        //컨티뉴 밑에 아무것도 없으면 의미가 없는 컨티뉴다.
			}
			sum += i;
		}
		System.out.println("1부터 100까지의 3의 배수의 총합은: " +sum);
	
	
	}
}