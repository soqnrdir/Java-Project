package lecture04;

 public class Gu9dan {

	public static void main(String[] args) {
		System.out.println("구구단을 실행합니다.");
			int i =2;                                       //먼저 초기값을 정해주면 for 문 초기값에 넣지 않아도 상관x
			for( ;i < 10;i++) {                             //바깥쪽 for문이 한 번 실행할 때마다 9행의 for문이 1부터 9까지 반복실행함.
				System.out.println("***" + i + "단 ***");
		    int j =1;
			for(;j < 10;j++) {                              //9까지 다 실행되면 바깥쪽 for문이 3으로 나와 위 결과를 바깥쪽 for문 9까지 반복실행함.
				System.out.println(i + "x" + j + "=" + (i*j));
			}
	    }
			System.out.println("구구단을 종료합니다.");
	}

}
