package lecture05;

public class ArrayLengthExample {

	public static void main(String[] args) {
		int[] scores = { 83, 90, 87 };
		int sum = 0;
		for(int i=0; i<scores.length; i++) { //인덱스는 배열길이보다 1이 적기 때문이다. 인덱스를 초과하면 ArrayIndexOutOfBoundsException. 이라는 오류가 발생된다.
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("평균 : " + avg);
	}

}
