package lecture05;

public class AdvancedForExample {

	public static void main(String[] args) {
		int[] scores = { 95, 71, 84, 93, 87 };
		
		int sum =0;
		for (int score : scores) {    //배열에서 가져올 첫 번째 값이 존재하는지 평가.
			sum = sum + score;		  //대입한 값들을 합산해. 변수 sum에 값을 저장한다.
		}
		System.out.println("점수 총합 = " + sum);
		
		double avg = (double) sum / scores.length; //배열수 = length. 즉 5로 나눈다는 뜻.
		System.out.println("점수 평균 = " + avg);
	}

}
