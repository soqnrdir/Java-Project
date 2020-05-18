package restudy;

public class rememory203 {

	public static void main(String[] args) {
		byte var1 = 125;
		int var2 = 125;
		for(int i =0;i<5;i++) {
			var1++; // 126,127,-128,-127,-126 이와같이 최대값 127을 넘으면 최소값인 -128부터 시작!
			var2++;
			System.out.println("var1: " + var1 + "/t" + "var2: " + var2); // \t는 tab만큼 칸을 띄워주는 역할.
		}

	}

}
