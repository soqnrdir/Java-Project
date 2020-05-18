package restudy;

public class rememory205 {

	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20L;
		//long var3 = 1000000000000;   //컴파일 에러 int타입의 저장 범위를 넘어났기 때문에 L을 붙여줘야함.
		long var4 = 1000000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);


	}

}
