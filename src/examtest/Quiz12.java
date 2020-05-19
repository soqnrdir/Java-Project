package examtest;

public class Quiz12 {

	public static void main(String[] args) {
		int[] cost = { 85, 42, 37, 10, 22, 8, 15}; //배열 항목에 저장될 값의 목록이 있으므로 배열 객체를 만들어 준다.
		int totalcost = 0;   //totalcost에 초기값을 정해준다.
		for (int i =0;i < cost.length;i++ ) { 
			totalcost += cost[i];
			
		}
		System.out.println(totalcost);
	}

}
