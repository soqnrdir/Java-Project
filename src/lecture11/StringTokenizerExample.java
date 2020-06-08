package lecture11;

import java.util.StringTokenizer;

public class StringTokenizerExample {
	public static void main(String[] args) {
		String text = "홍길동/이수홍/박연수";
		
		//how1: 전체 토큰 수를 얻어 for 문으로 루핑
		StringTokenizer st = new StringTokenizer(text, "/");
		int countTokens = st.countTokens(); //꺼내지 않고 남아 있는 토큰의 수
		for (int i = 0; i < countTokens; i++) {
			String token = st.nextToken();
			System.out.println(token);
		}

		System.out.println();
		
		//how2: 남아 있는 토큰을 확인하고 while문으로 루핑
		st = new StringTokenizer(text, "/");
		while(st.hasMoreTokens()) { //남아 있는 토큰 있는지 확인 
			String token = st.nextToken(); //토큰을 하나씩 꺼내옴
			System.out.println(token);
		}
	}

}
